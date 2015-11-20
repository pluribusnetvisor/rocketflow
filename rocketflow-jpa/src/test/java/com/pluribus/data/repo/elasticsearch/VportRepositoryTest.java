package com.pluribus.data.repo.elasticsearch;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluribus.data.configuration.RocketFlowElasticSearchConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RocketFlowElasticSearchConfig.class })
public class VportRepositoryTest {

	@Resource
	private VportRepoES vportRepository;
 
	@Before
	public void emptyData() {
		try {
			vportRepository.deleteAll();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void test1() {
		System.out.println(vportRepository.count());
	}
}