package com.pluribus.rocketflow.core;

import java.util.Observable;

public class DataEventChannel extends Observable {
	private RocketFlowEvent event;

	public RocketFlowEvent getEvent() {
		return event;
	}

	public void setEvent(RocketFlowEvent event) {
		this.event = event;
		this.setChanged();
	}
}
