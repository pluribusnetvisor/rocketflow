package com.pluribus.data.repo.mysql;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pluribus.data.entity.mysql.VportEntityMySQL;

@Repository
public interface VportRepoMySQL extends CrudRepository<VportEntityMySQL, Integer> {
	public List<VportEntityMySQL> findAll();

	@Query("SELECT vpe from VportEntityMySQL vpe WHERE vpe.switchId=:switchId AND vpe.mac=:mac")
	public List<VportEntityMySQL> findBySwitchAndMac(@Param("switchId") long switchId, @Param("mac") String mac);
	
	@Query("SELECT vpe from VportEntityMySQL vpe WHERE vpe.mac=:mac")
	public List<VportEntityMySQL> findByMac(@Param("mac") String mac);
	
}
