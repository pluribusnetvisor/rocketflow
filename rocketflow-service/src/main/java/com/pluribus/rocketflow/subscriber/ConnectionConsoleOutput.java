package com.pluribus.rocketflow.subscriber;

import java.util.List;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.ConnectionEventBundle;

public class ConnectionConsoleOutput extends EventObserver<ConnectionEventBundle> {

	@Override
	public void onEvent(ConnectionEventBundle event) throws Exception {
		List<ConnectionEntity> conns = event.getConnections();

		for (ConnectionEntity conn : conns) {
			System.out.println(conn);
		}

	}

}
