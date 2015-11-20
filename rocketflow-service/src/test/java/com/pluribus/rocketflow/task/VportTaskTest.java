package com.pluribus.rocketflow.task;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.rocketflow.configuration.TestRocketFlowServiceConfig;
import com.pluribus.rocketflow.service.RocketFlowService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestRocketFlowServiceConfig.class})
public class VportTaskTest {

	@Autowired
	RocketFlowService rocketFlowService;

	@Before
	public void setup() throws IOException {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testVPorts() {
		try {
			rocketFlowService.importVport();
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
}
