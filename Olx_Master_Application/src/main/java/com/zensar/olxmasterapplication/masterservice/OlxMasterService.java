package com.zensar.olxmasterapplication.masterservice;

import java.util.List;

import com.zensar.olxmasterapplication.dto.MasterDto;

public interface OlxMasterService {
	List<MasterDto> getAllCategories();
	List<MasterDto> getAllStatus();
}
