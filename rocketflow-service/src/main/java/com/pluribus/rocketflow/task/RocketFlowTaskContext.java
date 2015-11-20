package com.pluribus.rocketflow.task;

import java.util.List;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribusnetworks.config.Config;
import com.pluribusnetworks.config.Node;

public interface RocketFlowTaskContext {

	/**
	 * Gets the list of switch nodes in the fabric.
	 * @return
	 */
	List<Node> getNodes();

	/**
	 * Gets the node from the node list based on the nodeId.
	 * @param nodeId
	 * @return
	 */
	Node getNode(long nodeId);

	/**
	 * Fabric host.
	 * @return
	 */
	String getHostname();

	void setHostname(String hostname);

	/**
	 * Fabric login name.
	 * @return
	 */
	String getUsername();

	void setUsername(String username);

	/**
	 * Fabric password
	 * @return
	 */
	String getPassword();

	void setPassword(String password);

	/**
	 * Fabric Config object.
	 * @return
	 */
	Config getNvConfig();

	/**
	 * The rocketflow context
	 * @return
	 */
	RocketFlowContext getRocketFlowContext();

}