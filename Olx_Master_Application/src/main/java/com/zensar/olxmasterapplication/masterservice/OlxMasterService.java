package com.zensar.olxmasterapplication.masterservice;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.zensar.olxmasterapplication.dto.MasterDto;
import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface OlxMasterService {
	List<MasterDto> getAllCategories();
	List<MasterDto> getAllStatus();
	List<MasterDto> findOlxMasterByCategory( String category1);
	List<MasterDto> findOlxMasterByStatus(String status1);
}
