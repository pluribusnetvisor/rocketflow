package com.pluribus.rocketflow.rest;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.rocketflow.configuration.TestRocketFlowServiceConfig;
import com.pluribus.rocketflow.rest.NvosConnection;
import com.pluribus.rocketflow.rest.NvosFabricNode;
import com.pluribus.rocketflow.rest.NvosRest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestRocketFlowServiceConfig.class})
public class NvosRestTest {

	@Test
	public void testRestConnection() {
		NvosRest nr = new NvosRest();

		List<NvosFabricNode> nodes = nr.getFabricNodes();
		for (NvosFabricNode node : nodes) {
			NvosConnection filter = new NvosConnection();
			filter.setTransitionState("started");
			filter.setWithinLast(60);

			List<NvosConnection> connections = nr.getConnections(node.getId(), filter);
			assertTrue(connections.size() > 0);
			System.out.println(node.getName() + "(" + node.getId() + "). Connection read=" + connections.size());
//			for (NvosConnection connection : connections) {
//				System.out.println(connection.getCurState() + " " + connection.getStartedTime());
//			}
		}

	}
}
