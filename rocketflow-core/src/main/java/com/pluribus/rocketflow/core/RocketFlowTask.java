package com.pluribus.rocketflow.core;

public interface RocketFlowTask {
	public void run(RocketFlowContext ctx) throws Exception;
}