package com.pluribus.data.configuration;

import java.net.UnknownHostException;

import org.apache.log4j.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.pluribus.data.repo.elasticsearch")
public class RocketFlowElasticSearchConfig {

	private static Logger logger = Logger.getLogger(RocketFlowElasticSearchConfig.class);
	
	String elasticSearchServer = "localhost"; 
//	String elasticSearchServer = "10.9.32.134"; 
	int elasticSearchPort = 9300;

	/**
	 * Creates the elasticsearchTemplate bean for repository use.
	 * 
	 * @return
	 * @throws UnknownHostException
	 */
	@Bean
	public ElasticsearchOperations elasticsearchTemplate() throws UnknownHostException {

		Settings settings = ImmutableSettings.settingsBuilder()
//				.put("cluster.name", "netviser")
				.put("client.transport.sniff", true).build();
 
		logger.info("ElasticSearch server=" + elasticSearchServer + ":" + elasticSearchPort);
		TransportClient esClient = new TransportClient(settings);
		esClient.addTransportAddress(new InetSocketTransportAddress(elasticSearchServer, elasticSearchPort));
		ElasticsearchTemplate elasticsearchTemplate = new ElasticsearchTemplate(esClient);
		
		// Initialize Elasticsearch indices
		elasticsearchTemplate.createIndex(ConnectionEntityES.class);
		elasticsearchTemplate.putMapping(ConnectionEntityES.class);
//		elasticsearchTemplate.createIndex(VportEntityES.class);
//		elasticsearchTemplate.putMapping(VportEntityES.class);
		
		return elasticsearchTemplate;
	}
}