package com.pluribus.data.repo.elasticsearch;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.data.configuration.RocketFlowElasticSearchConfig;
import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RocketFlowElasticSearchConfig.class })
public class ConnectionRepositoryTest {

	@Resource
	private ConnectionRepoES connectionRepository;
 
	@Before
	public void emptyData() {
//		try {
//			connectionRepository.deleteAll();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}

	@Test
	public void test1() {
		System.out.println(connectionRepository.count());
	}
	
	@Test
	public void testTimeQuery() {
		List<ConnectionEntityES> connections = connectionRepository.findByStartedTimeBetween("2015-11-11T05:49:00", "2015-11-11T05:50:00");
		for (ConnectionEntityES connection : connections) {
			System.out.println(connection);
		}
		
//		SearchQuery searchQuery = new NativeSearchQueryBuilder()
//			    .withQuery(matchAllQuery())
//			    .withIndices("test-index")
//			    .withTypes("test-type")
//			    .withPageable(new PageRequest(0,1))
//			    .build();		
//		connectionRepository.search(searchQuery);
	}
}