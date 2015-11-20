package com.pluribus.rocketflow.reader.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.log4j.Logger;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;
import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.rest.NvosConnection;
import com.pluribus.rocketflow.rest.NvosFabricNode;
import com.pluribus.rocketflow.rest.NvosRest;
import com.pluribus.rocketflow.util.BeanUtil;
import com.pluribus.rocketflow.util.ConnUtil;

public class ConnectionEventRestReader extends AbstractRestEventReader<ConnectionEventBundle> {
	private static Logger logger = Logger.getLogger(ConnectionEventRestReader.class);

	private NvosFabricNode nvosNode;

	public ConnectionEventRestReader(RocketFlowContext rocketFlowContext, NvosRest nvosRest, NvosFabricNode nvosNode) {
		super(rocketFlowContext, nvosRest);
		this.nvosNode = nvosNode;
	}

	@Override
	protected ConnectionEventBundle readEvents() throws Exception {
		Map<String, NvosConnection> hmConns = new HashMap<String, NvosConnection>();

		logger.debug("Reading from " + nvosNode.getName());
		NvosConnection filter = new NvosConnection();
		// 60 seconds
		filter.setWithinLast(60);
		filter.setTransitionState("started");
		List<NvosConnection> startedConns = getNvosRest().getConnections(nvosNode.getId(), filter);
		logger.debug(startedConns.size() + " imported from STARTED state");

		filter.setWithinLast(60);
		filter.setTransitionState("ended");
		List<NvosConnection> endedConns = getNvosRest().getConnections(nvosNode.getId(), filter);
		logger.debug(endedConns.size() + " imported from ENDED state");

		merge(hmConns, startedConns);
		merge(hmConns, endedConns);

		List<ConnectionEntity> ces = convert(hmConns.values());
		return new ConnectionEventBundle(this.getRocketFlowContext(), nvosNode.getName(), ces);
	}

	private void merge(Map<String, NvosConnection> hmConns, List<NvosConnection> conns) {
		for (NvosConnection conn : conns) {
			String flowLocator = ConnUtil.generateFlowLocator("", conn);
			hmConns.put(flowLocator, conn);
		}
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	private List<ConnectionEntity> convert(Collection<NvosConnection> connections) {
		sdf.setTimeZone(TimeZone.getTimeZone("PST"));
		List<ConnectionEntity> ces = new ArrayList<ConnectionEntity>(connections.size());

		for (NvosConnection connection : connections) {
			try {
				ConnectionEntityES targetCe = new ConnectionEntityES();
				BeanUtil.copyProperties(connection, targetCe);

				String flowLocator = ConnUtil.generateFlowLocator(nvosNode.getName(), connection);

				BeanUtil.copyProperties(connection, targetCe);

				targetCe.setIbytes(connection.getInputBytes());
				targetCe.setObytes(connection.getOutBytes());

				if (connection.getStartedTime() != null) {
					targetCe.setStartedTime(sdf.parse(connection.getStartedTime()).getTime());
					targetCe.setStartedTimeStr(connection.getStartedTime());
				}
				if (connection.getEndedTime() != null) {
					targetCe.setEndedTime(sdf.parse(connection.getEndedTime()).getTime());
					targetCe.setEndedTimeStr(connection.getEndedTime());
				}

				targetCe.setSwitchName(nvosNode.getName());
				targetCe.setFabricName(nvosNode.getFabName());
				targetCe.setFlowLocator(flowLocator);

				ces.add(targetCe);
			} catch (ParseException e) {
				// skip the connection
			}

		}

		return ces;
	}
}
