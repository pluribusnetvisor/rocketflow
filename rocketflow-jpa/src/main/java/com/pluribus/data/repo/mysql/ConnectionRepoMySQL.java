package com.pluribus.data.repo.mysql;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pluribus.data.entity.mysql.ConnectionEntityMySQL;

@Repository
public interface ConnectionRepoMySQL extends CrudRepository<ConnectionEntityMySQL, Integer> {
	public List<ConnectionEntityMySQL> findAll();

	@Query("SELECT ce from ConnectionEntityMySQL ce WHERE ce.flowLocator=:flowLocator")
	public List<ConnectionEntityMySQL> findByFlowLocator(@Param("flowLocator") String flowLocator);
}