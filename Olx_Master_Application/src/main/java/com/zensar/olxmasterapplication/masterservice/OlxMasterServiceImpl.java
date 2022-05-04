package com.zensar.olxmasterapplication.masterservice;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterRequest;
import com.zensar.olxmasterapplication.entity.OlxMasterResponse;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;
import com.zensar.olxmasterapplication.repository.MasterCategoryRepository;
import com.zensar.olxmasterapplication.repository.MasterStatusRepository;
@Service
public class OlxMasterServiceImpl implements OlxMasterService {
	/*
	 * @Autowired private OlxMasterCategory olxMasterCategory;
	 * 
	 * @Autowired private OlxMasterStatus olxMasterStatus;
	 */
	@Autowired
	private MasterCategoryRepository masterCategoryRepository;
	@Autowired
	private MasterStatusRepository masterStatusRepository;
	private ModelMapper modelMapper =new ModelMapper();
	/*
	 * private OlxMasterResponse olxMasterResponse=new OlxMasterResponse(); private
	 * OlxMasterRequest olxMasterRequest=new OlxMasterRequest();
	 */
	static List<OlxMasterCategory> categoryList = new ArrayList<OlxMasterCategory>();
	static List<OlxMasterStatus> statusList = new ArrayList<OlxMasterStatus>();
	static {
		statusList.add(new OlxMasterStatus(1, "OPEN"));
		statusList.add(new OlxMasterStatus(2, "CLOSED"));
	}
	static {
		categoryList.add(new OlxMasterCategory(1, "Furniture"));
		categoryList.add(new OlxMasterCategory(2, "Cars"));
		categoryList.add(new OlxMasterCategory(4, "RealEstate"));
		categoryList.add(new OlxMasterCategory(5, "Sports"));

	}

	@Override
	public List<OlxMasterResponse> getAllCategories(int pageNumber,int pageSize) {
		Page<OlxMasterCategory> pageOlx= masterCategoryRepository.findAll(PageRequest.of(pageNumber, pageSize));
		List<OlxMasterCategory> content=pageOlx.getContent();
		List<OlxMasterResponse> olxMasterResponses=new ArrayList<>();
		for(OlxMasterCategory stock:content) {
			OlxMasterResponse olxMasterResponse=modelMapper.map(pageOlx,OlxMasterResponse.class);
			olxMasterResponses.add(olxMasterResponse);
			}
		return olxMasterResponses;
			
	}

	@Override
	public List<OlxMasterResponse> getAllStatus(int pageNumber,int pageSize) {
		Page<OlxMasterStatus> pageOlx= masterStatusRepository.findAll(PageRequest.of(pageNumber, pageSize));
		List<OlxMasterStatus> content=pageOlx.getContent();
		List<OlxMasterResponse> olxMasterResponses=new ArrayList<>();
		for(OlxMasterStatus stock:content) {
			OlxMasterResponse olxMasterResponse=modelMapper.map(pageOlx,OlxMasterResponse.class);
			olxMasterResponses.add(olxMasterResponse);
			}
		return olxMasterResponses;
	}
	public OlxMasterCategory MapToOlxCategory(OlxMasterRequest olxMasterRequest) {
		OlxMasterCategory newOlx=new OlxMasterCategory();
		newOlx.setId(olxMasterRequest.getId());
		newOlx.setCategory(olxMasterRequest.getCategory());
		return newOlx;
		

	}
	public OlxMasterCategory MapToOlxCategory(OlxMasterResponse olxMasterResponse) {
		OlxMasterCategory newOlx=new OlxMasterCategory();
		newOlx.setId(olxMasterResponse.getId());
		newOlx.setId(olxMasterResponse.getId());
		newOlx.setCategory(olxMasterResponse.getCategory());
		
		return newOlx;
		
	}
	public OlxMasterResponse MapToResponseCategory(OlxMasterCategory olx) {
		OlxMasterResponse olxMasterResponse=new OlxMasterResponse();
		olxMasterResponse.setId(olx.getId());
		olxMasterResponse.setCategory(olx.getCategory());
		return olxMasterResponse;
		/*
		 * olxResponse.setMarketName(olx.getMarketName());
		 * olxResponse.setName(olx.getName()); Response.setPrice(olx.getPrice()); return
		 * olxResponse;
		 */
		
	}
	public OlxMasterStatus MapToOlxStatus(OlxMasterRequest olxMasterRequest) {
		OlxMasterStatus newOlx=new OlxMasterStatus();
		newOlx.setId(olxMasterRequest.getId());
		newOlx.setStatus(olxMasterRequest.getStatus());
		return newOlx;
		

	}
	public OlxMasterStatus MapToOlxStatus(OlxMasterResponse olxMasterResponse) {
		OlxMasterStatus newOlx=new OlxMasterStatus();
		newOlx.setId(olxMasterResponse.getId());
		newOlx.setStatus(olxMasterResponse.getStatus());
		
		return newOlx;
		
	}
	public OlxMasterResponse MapToResponseStatus(OlxMasterStatus olx) {
		OlxMasterResponse olxMasterResponse=new OlxMasterResponse();
		olxMasterResponse.setId(olx.getId());
		olxMasterResponse.setStatus(olx.getStatus());
		return olxMasterResponse;
		/*
		 * olxResponse.setMarketName(olx.getMarketName());
		 * olxResponse.setName(olx.getName()); Response.setPrice(olx.getPrice()); return
		 * olxResponse;
		 */
		
	}
}


