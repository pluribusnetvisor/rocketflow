package com.pluribus.rocketflow.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pluribus.data.configuration.RocketFlowElasticSearchConfig;
import com.pluribus.data.configuration.RocketFlowMySQLConfig;
import com.pluribus.rocketflow.service.RocketFlowService;

@Configuration
@Import({ RocketFlowMySQLConfig.class, RocketFlowElasticSearchConfig.class })
@ComponentScan("com.pluribus.rocketflow.service")
public class TestRocketFlowServiceConfig extends RocketFlowServiceConfig {

	@Bean
	public RocketFlowService rocketflowService() {
		RocketFlowService rocketflowService = new RocketFlowService();

		return rocketflowService;
	}
}
