package com.pluribus.rocketflow.event;

import java.util.List;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.rocketflow.core.RocketFlowContext;

public class ConnectionEventBundle extends NvosEvent {
	private List<ConnectionEntity> connections;

	public ConnectionEventBundle(RocketFlowContext rocketflowContext, String fabricName, List<ConnectionEntity> connections) {
		super(rocketflowContext, fabricName);

		this.connections = connections;
	}

	public List<ConnectionEntity> getConnections() {
		return connections;
	}
}
