package com.pluribus.rocketflow.core;

import com.pluribus.rocketflow.service.DnsService;
import com.pluribus.rocketflow.service.PortMappingService;

public interface RocketFlowContext {

	/**
	 * Gets the DNS service.
	 * @return
	 */
	public DnsService getDnsService();

	/**
	 * Gets the RocketFlowHub Hub
	 */
	public RocketFlowHub getRocketFlowHub();

	/**
	 * Gets the Port Mapping Service.
	 */
	public PortMappingService getPortMappingService();
}
