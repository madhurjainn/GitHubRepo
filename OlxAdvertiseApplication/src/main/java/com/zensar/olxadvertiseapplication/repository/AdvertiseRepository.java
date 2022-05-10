package com.zensar.olxadvertiseapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;
public interface AdvertiseRepository extends JpaRepository<OlxAdvertises, Integer>{
	
	@Query(value="select * from olx_advertises where category=:category1",nativeQuery=true)
	List<OlxAdvertises> findOlxMasterByCategory(@Param("category1") String category1);



}
