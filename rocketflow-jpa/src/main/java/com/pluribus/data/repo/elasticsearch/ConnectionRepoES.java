package com.pluribus.data.repo.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.pluribus.data.entity.elasticsearch.ConnectionEntityES;

public interface ConnectionRepoES extends ElasticsearchRepository<ConnectionEntityES, String> {

	List<ConnectionEntityES> findByFlowLocator(String flowLocator);
	List<ConnectionEntityES> findByStartedTimeBetween(String from, String to);
}
