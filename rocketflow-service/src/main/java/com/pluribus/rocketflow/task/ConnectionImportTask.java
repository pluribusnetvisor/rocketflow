package com.pluribus.rocketflow.task;

import org.apache.log4j.Logger;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.RocketFlowHub;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.reader.ConnectionEventReader;
import com.pluribusnetworks.config.Node;

public class ConnectionImportTask extends BaseTask {
	private Logger logger = Logger.getLogger(ConnectionImportTask.class);

	public ConnectionImportTask(RocketFlowContext ctx) {
		super(ctx);
	}

	@Override
	protected void _runTask() throws RocketFlowException {
		logger.debug("Importing connections...");
		int count = 0;
		for (Node node : getNodes()) {
			ConnectionEventReader reader = new ConnectionEventReader(this.getRocketFlowContext(), this.getNvConfig(), node);
			ConnectionEventBundle event = reader.getEvent();
			count += event.getConnections().size();
			getRocketFlowContext().getRocketFlowHub().publish(RocketFlowHub.CONN_CHANNEL, event);
		}

		logger.info("Total " + count + " connections imported from fabric.");
	}
}
