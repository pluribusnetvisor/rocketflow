package com.pluribus.rocketflow.reader;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;
import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.util.BeanUtil;
import com.pluribus.rocketflow.util.ConnUtil;
import com.pluribusnetworks.config.Config;
import com.pluribusnetworks.config.Conn;
import com.pluribusnetworks.config.ConnTransition;
import com.pluribusnetworks.config.FormatArgs;
import com.pluribusnetworks.config.Node;
import com.pluribusnetworks.io.Result;

public class ConnectionEventReader extends AbstractNvosEventReader<ConnectionEventBundle> {
	private static Logger logger = Logger.getLogger(ConnectionEventReader.class);

	private static final int STARTED_OUTPUT_LIMIT = 2000;
	private static final int ENDED_OUTPUT_LIMIT = 2000;

	private long updateDuration = TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES);

	private Node switchNode;
	private Config nvConfig;

	public ConnectionEventReader(RocketFlowContext rocketflowContext, Config nvConfig, Node switchNode) {
		super(rocketflowContext);

		this.switchNode = switchNode;
		this.nvConfig = nvConfig;
	}

	@Override
	protected ConnectionEventBundle readFabricEvents() throws Exception {
		List<Conn> connsStarted = new ArrayList<Conn>();

		Conn connFilter = new Conn();
		// Set update duration
		connFilter.getArgs().setWithinLast(updateDuration);

		String fabricName = switchNode.getFabricName();
		// Set the switch context
		nvConfig.setSwitchId(switchNode.getIdent());
		FormatArgs formatArgs = new FormatArgs();

		connFilter.setTrans(ConnTransition.ENDED);
		// Set the output limit
		formatArgs.setLimitOutput(STARTED_OUTPUT_LIMIT);

		Result result = nvConfig.showConnStat(connFilter, formatArgs, connsStarted);
		if (result.code < 0) {
			throw new RocketFlowException(result.code, result.message);
		}

		List<Conn> connsEnded = new ArrayList<Conn>();

		connFilter.setTrans(ConnTransition.STARTED);
		formatArgs.setLimitOutput(ENDED_OUTPUT_LIMIT);
		result = nvConfig.showConnStat(connFilter, formatArgs, connsEnded);
		if (result.code < 0) {
			throw new RocketFlowException(result.code, result.message);
		}

		// merge connsNoFilter and connsRunning according to the flow locator.
		Map<String, Conn> hmConns = new HashMap<String, Conn>();
		merge(hmConns, connsStarted);
		merge(hmConns, connsEnded);

		// Call connection_show within-last
		logger.debug(hmConns.size() + " connections read.");

		// Create the event for data folow
		List<ConnectionEntity> ces = convert(hmConns.values());

		ConnectionEventBundle event = new ConnectionEventBundle(this.getRocketFlowContext(), fabricName, ces);

		return event;
	}

	private void merge(Map<String, Conn> hmConns, List<Conn> conns) {
		for (Conn conn : conns) {
			String flowLocator = ConnUtil.generateFlowLocator("", conn);
			hmConns.put(flowLocator, conn);
		}
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD HH:mm:ss");

	private List<ConnectionEntity> convert(Collection<Conn> conns) {
		List<ConnectionEntity> ces = new ArrayList<ConnectionEntity>(conns.size());

		for (Conn connection : conns) {
			ConnectionEntityES targetCe = new ConnectionEntityES();
			BeanUtil.copyProperties(connection, targetCe);

			Node node = this.switchNode;
	        String switchName = node.getName();
	        String fabricName = node.getFabricName();
			String flowLocator = ConnUtil.generateFlowLocator(switchName, connection);

			BeanUtil.copyProperties(connection, targetCe);
			if (connection.getState() != null) {
				targetCe.setCurState(connection.getState().name());
			}

			targetCe.setDstIp(connection.getServerIpStr());
			if (connection.getServerMacAddr() != null) {
				targetCe.setDstMac(connection.getServerMacAddr().toString());
			}

			targetCe.setDstPort(connection.getServerPort());
			targetCe.setDstSwitchPort(connection.getServerSwitchPort());

			targetCe.setIbytes(connection.getBytesRecv());
			targetCe.setObytes(connection.getBytesSent());
			targetCe.setLatency(connection.getAvgLatency());

			targetCe.setSrcIp(connection.getClientIpStr());
			if (connection.getClientMacAddr() != null) {
				targetCe.setSrcMac(connection.getClientMacAddr().toString());
			}
			targetCe.setSrcPort(connection.getClientPort());
			targetCe.setSrcSwitchPort(connection.getClientSwitchPort());
			targetCe.setTotalBytes(connection.getBytesTotal());
			if (connection.getStartedTime() != null) {
				targetCe.setStartedTime(connection.getStartedTime().getTime());
				targetCe.setStartedTimeStr(sdf.format(connection.getStartedTime()));
			}
			if (connection.getEndedTime() != null) {
				targetCe.setEndedTime(connection.getEndedTime().getTime());
				targetCe.setEndedTimeStr(sdf.format(connection.getEndedTime()));
			}

			targetCe.setSwitchName(switchName);
			targetCe.setFabricName(fabricName);
			targetCe.setFlowLocator(flowLocator);


			/**
			 * DNS Lookup
			 */
//			if (connection.getClientIp() != null) {
//				String hostname = ctx.getRocketFlowContext().getDnsService().lookupHostname(connection.getClientIp());
//				if (hostname == null) {
//					targetCe.setSrcHostname(connection.getClientIpStr());
//				} else {
//					targetCe.setSrcHostname(hostname);
//				}
//			}
//
//			if (connection.getServerIp() != null) {
//				String hostname = ctx.getRocketFlowContext().getDnsService().lookupHostname(connection.getServerIp());
//				if (hostname == null) {
//					targetCe.setDstHostname(connection.getServerIpStr());
//				} else {
//					targetCe.setDstHostname(hostname);
//				}
//			}

			ces.add(targetCe);
		}

		return ces;
	}

}
