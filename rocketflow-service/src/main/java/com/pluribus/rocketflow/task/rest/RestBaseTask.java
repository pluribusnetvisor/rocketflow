package com.pluribus.rocketflow.task.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.rest.NvosFabricNode;
import com.pluribus.rocketflow.rest.NvosRest;

public abstract class RestBaseTask {
	public static Logger logger = Logger.getLogger(RestBaseTask.class);

	private RocketFlowContext ctx;

	private HashMap<Integer, NvosFabricNode> nodeMap = new HashMap<Integer, NvosFabricNode>();
	private NvosRest nvosRest;

	public RestBaseTask(RocketFlowContext ctx, NvosRest nvosRest) {
		this.ctx = ctx;
		this.nvosRest = nvosRest;
	}

	/**
	 * Boiler template for running task.
	 */
	public void runTask() {
		try {
			loadNodeMap();
			_runTask();
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

	private void loadNodeMap() {
		List<NvosFabricNode> nodes = nvosRest.getFabricNodes();
		for (NvosFabricNode node : nodes) {
			nodeMap.put(node.getId(), node);
		}
	}

	public Collection<NvosFabricNode> getNodes() {
		return nodeMap.values();
	}

	public NvosFabricNode getNode(long id) {
		return nodeMap.get(id);
	}

	public NvosRest getNvosRest() {
		return nvosRest;
	}

	public void setNvosRest(NvosRest nvosRest) {
		this.nvosRest = nvosRest;
	}

	public RocketFlowContext getRocketFlowContext() {
		return ctx;
	}

	protected abstract void _runTask() throws RocketFlowException;


}
