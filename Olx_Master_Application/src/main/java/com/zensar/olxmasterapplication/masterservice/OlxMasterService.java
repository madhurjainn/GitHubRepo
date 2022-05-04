package com.zensar.olxmasterapplication.masterservice;

import java.util.List;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterResponse;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface OlxMasterService {
	List<OlxMasterResponse> getAllCategories(int pageNumber,int pageSize);
	List<OlxMasterResponse> getAllStatus(int pageNumber,int pageSize);
}
