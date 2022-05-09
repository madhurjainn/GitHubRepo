package com.zensar.olxmasterapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface MasterCategoryRepository extends JpaRepository<OlxMasterCategory , Integer>{
	
	@Query(value="select * from olx_master_category where category=:category1",nativeQuery=true)
	List<OlxMasterCategory> findOlxMasterByCategory(@Param("category1") String category1);
	

}
