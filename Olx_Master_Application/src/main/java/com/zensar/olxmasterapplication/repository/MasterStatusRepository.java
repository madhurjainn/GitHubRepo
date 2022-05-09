package com.zensar.olxmasterapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface MasterStatusRepository extends JpaRepository<OlxMasterStatus, Integer> {
	@Query(value = "select * from olx_master_status where status=:status1", nativeQuery = true)
	List<OlxMasterStatus> findOlxMasterByStatus(@Param("status1") String status1);

}
