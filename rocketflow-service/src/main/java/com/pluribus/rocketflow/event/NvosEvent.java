package com.pluribus.rocketflow.event;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowEvent;

public class NvosEvent extends RocketFlowEvent {
	private String fabricName;

	public NvosEvent(RocketFlowContext rocketFlowContext, String fabricName) {
		super(rocketFlowContext);
		this.fabricName = fabricName;
	}

	public String getFabricName() {
		return fabricName;
	}

	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}
}
