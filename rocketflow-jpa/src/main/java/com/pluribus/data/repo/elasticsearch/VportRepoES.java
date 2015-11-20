package com.pluribus.data.repo.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.pluribus.data.entity.elasticsearch.VportEntityES;

public interface VportRepoES extends ElasticsearchRepository<VportEntityES, String> {
}
