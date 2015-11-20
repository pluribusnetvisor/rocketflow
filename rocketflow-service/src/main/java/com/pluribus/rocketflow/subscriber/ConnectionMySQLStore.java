package com.pluribus.rocketflow.subscriber;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.data.entity.mysql.ConnectionEntityMySQL;
import com.pluribus.data.repo.mysql.ConnectionRepoMySQL;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.util.BeanUtil;

public class ConnectionMySQLStore extends BaseConnectionStore {
	private static Logger logger = Logger.getLogger(ConnectionMySQLStore.class);

	@Autowired
	private ConnectionRepoMySQL connectionRepo;

	@Override
	public void onEvent(ConnectionEventBundle event) throws Exception {
		long createCount = 0;
		long updateCount = 0;
		long skipCount = 0;
		boolean skip = false;

		List<ConnectionEntity> connections = event.getConnections();
		logger.info("Importing " + connections.size() + " connections");

		for (ConnectionEntity srcConn : connections) {
			String flowLocator = srcConn.getFlowLocator();
			List<ConnectionEntityMySQL> ces = connectionRepo.findByFlowLocator(flowLocator);
			ConnectionEntityMySQL targetConn = null;

			skip = false;

			// Check if existing connection with the same flow location is found.
			for (ConnectionEntityMySQL ce : ces) {
				targetConn = ce;
				skip = compare(ce, srcConn);
				break; // interested in the first one only
			}

			if (targetConn == null) {
				// Connection not found.
				createCount++;
				targetConn = new ConnectionEntityMySQL();
			} else {
				// Connection found. Check if we should update or skip.
				if (skip) {
					skipCount++;
				} else {
					updateCount++;
				}
			}

			if (!skip) {
				BeanUtil.copyProperties(null, srcConn, targetConn, null, "id");
				connectionRepo.save(targetConn);
			}
		}

		logger.info("Connections: created=" + createCount + " udpdated=" + updateCount + " skipped=" + skipCount);
	}

}
