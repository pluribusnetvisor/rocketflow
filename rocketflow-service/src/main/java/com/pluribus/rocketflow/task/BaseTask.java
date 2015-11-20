package com.pluribus.rocketflow.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribusnetworks.config.Config;
import com.pluribusnetworks.config.Node;
import com.pluribusnetworks.io.Result;

public abstract class BaseTask implements RocketFlowTaskContext {
	public static Logger logger = Logger.getLogger(BaseTask.class);

	private RocketFlowContext ctx;

//	private String switchHostname ="pn-dev01.pluribusnetworks.com";
	private String switchHostname ="10.20.19.103";
	private String switchUsername = "network-admin";
	private String switchPassword = "test123";

	private Config nvConfig;

	public BaseTask(RocketFlowContext ctx) {
		this.ctx = ctx;
	}

	/**
	 * Boiler template for running task.
	 *
	 * @param st the SynchronizeTask to run
	 */
	public void runTask() {
		try {
			connect();
			loadNodeMap();
			_runTask();
		} catch (Throwable ex) {
			ex.printStackTrace();
		} finally {
			close();
		}
	}

	protected abstract void _runTask() throws RocketFlowException;

	/**
	 * Login nvos session.
	 *
	 * @throws IOException
	 */
	private void connect() throws IOException {
		if (nvConfig != null) {
			nvConfig.logout();
		}

		nvConfig = new Config();
		nvConfig.connectHost(switchHostname);
		nvConfig.authenticate(switchUsername, switchPassword);
	}

	/**
	 * logout nvos session.
	 */
	private void close() {
		try {
			if (nvConfig != null) {
				nvConfig.logout();
			}
		} catch (IOException e) {
		}
	}


	private HashMap<Long, Node> nodeMap = new HashMap<Long, Node>();

	private void loadNodeMap() throws IOException, RocketFlowException {
		List<Node> switches = new ArrayList<Node>();
        Result result = nvConfig.showFabricSwitchInfo(new Node(), switches);

		if (result.code != 0) {
			throw new RocketFlowException(result.code, result.message);
		}

		for (Node switchNode : switches) {
			if (nodeMap.get(switchNode.getIdent()) == null) {
				nodeMap.put(switchNode.getIdent(), switchNode);
				logger.debug("Switch node (" + switchNode.getName() + ") loaded.");
			}
		}
	}

	@Override
	public List<Node> getNodes() {
		return new ArrayList<Node>(nodeMap.values());
	}

	/**
	 * Gets the node from the node list based on the nodeId.
	 * @param nodeId
	 * @return
	 */
	@Override
	public Node getNode(long nodeId) {
		return nodeMap.get(nodeId);
	}

	@Override
	public String getHostname() {
		return switchHostname;
	}

	@Override
	public void setHostname(String hostname) {
		this.switchHostname = hostname;
	}

	@Override
	public String getUsername() {
		return switchUsername;
	}

	@Override
	public void setUsername(String username) {
		this.switchUsername = username;
	}

	@Override
	public String getPassword() {
		return switchPassword;
	}

	@Override
	public void setPassword(String password) {
		this.switchPassword = password;
	}

	@Override
	public Config getNvConfig() {
		return nvConfig;
	}

	@Override
	public RocketFlowContext getRocketFlowContext() {
		return ctx;
	}


}
