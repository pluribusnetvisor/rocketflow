package com.pluribus.rocketflow.core;

public class RocketFlowEvent {
	protected RocketFlowContext rocketFlowContext;

	public RocketFlowEvent(RocketFlowContext ctx) {
		this.rocketFlowContext = ctx;
	}

	public RocketFlowContext getRocketFlowContext() {
		return rocketFlowContext;
	}

	public void setRocketFlowContext(RocketFlowContext rocketFlowContext) {
		this.rocketFlowContext = rocketFlowContext;
	}
}
