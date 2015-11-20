package com.pluribus.rocketflow.task.rest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.rocketflow.configuration.TestRocketFlowServiceConfig;
import com.pluribus.rocketflow.service.RocketFlowService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestRocketFlowServiceConfig.class})
public class ConnectionTaskRestTest {

	@Autowired
	private RocketFlowService rocketFlowService;

	@Test
	public void testImportConnection() {
		try {
			rocketFlowService.importConntectionRest();
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(false);
		}
	}
}
