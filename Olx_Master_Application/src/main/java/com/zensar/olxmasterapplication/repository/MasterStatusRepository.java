package com.zensar.olxmasterapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface MasterStatusRepository extends JpaRepository<OlxMasterStatus, Integer>{

}
