package com.pluribus.rocketflow.subscriber;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;
import com.pluribus.data.repo.elasticsearch.ConnectionRepoES;
import com.pluribus.rocketflow.event.ConnectionEventBundle;
import com.pluribus.rocketflow.service.PortMappingService;
import com.pluribus.rocketflow.service.PortMappingService.PortMappingEntry;
import com.pluribus.rocketflow.util.BeanUtil;

public class ConnectionElasticSearchStore extends BaseConnectionStore {
	private static Logger logger = Logger.getLogger(ConnectionElasticSearchStore.class);

	@Autowired
	private ConnectionRepoES connectionRepository;

	@Override
	public void onEvent(ConnectionEventBundle event) throws Exception {
		PortMappingService pms = event.getRocketFlowContext().getPortMappingService();

		List<ConnectionEntity> ces = event.getConnections();
		List<ConnectionEntityES> toBeSaved = new ArrayList<ConnectionEntityES>(ces.size());

		for (ConnectionEntity ce : ces) {
			// insert
			ConnectionEntityES cees = BeanUtil.convert(ce, ConnectionEntityES.class);
			cees.setId(cees.getFlowLocator());

			// Add the throughput field.
			if (ce.getDur() > 0) {
				// dur in nano seconds
				// throughput in Mbps//
				// 1000000000 * 8 / 1000000 = 8000
				cees.setThroughput(ce.getTotalBytes() * 8000/ ce.getDur());
			} else {
				cees.setThroughput(0);
			}

			// Add the latency in micro-second
			cees.setLatencyUsec(ce.getLatency() / 1000);

			PortMappingEntry pme = pms.getPortMapping(ce.getProto(), (int) ce.getDstPort());
			if (pme != null) {
				cees.setApp(pme.getService());
			} else {
				cees.setApp(Long.toString(ce.getDstPort()));
			}

			toBeSaved.add(cees);
		}

		if (toBeSaved.size() > 0) {
			connectionRepository.save(toBeSaved);
		}

		logger.debug("connection: upserted=" + ces.size());
	}

}
