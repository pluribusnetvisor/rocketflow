package com.pluribus.rocketflow.synchronizer;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.rocketflow.configuration.RocketFlowServiceConfig;
import com.pluribus.rocketflow.service.RocketFlowService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RocketFlowServiceConfig.class})
public class FabricTest {

	@Autowired
	RocketFlowService rocketFlowService;

	@Before
	public void setup() throws IOException {
	}

	@After
	public void tearDown() {
	}

//	@Test
	public void testVPorts() {
		try {
			rocketFlowService.importVport();
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testImportConnection() {
		try {
			rocketFlowService.importConntection();
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(false);
		}
	}
}
