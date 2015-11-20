package com.pluribus.rocketflow.task.rest;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.RocketFlowHub;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.reader.rest.ConnectionEventRestReader;
import com.pluribus.rocketflow.rest.NvosFabricNode;
import com.pluribus.rocketflow.rest.NvosRest;

public class ConnectionImportRestTask extends RestBaseTask {
	private Logger logger = Logger.getLogger(ConnectionImportRestTask.class);

	public ConnectionImportRestTask(RocketFlowContext ctx, NvosRest nvosRest) {
		super(ctx, nvosRest);
	}

	protected void _runTask() throws RocketFlowException {
		logger.debug("Importing connections from vRest...");
		int count = 0;
		for (NvosFabricNode node : this.getNodes()) {
			ConnectionEventRestReader reader = new ConnectionEventRestReader(getRocketFlowContext(), getNvosRest(), node);
			ConnectionEventBundle bundle = reader.getEvent();
			getRocketFlowContext().getRocketFlowHub().publish(RocketFlowHub.CONN_CHANNEL, bundle);
			count += bundle.getConnections().size();
		}

		logger.info("Total " + count + " connections imported from fabric.");

	}
}
