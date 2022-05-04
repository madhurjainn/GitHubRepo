package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.List;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseRequest;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertiseResponse;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;

public interface OlxAdvertiseService {
	OlxAdvertiseResponse createNewAdvertise(OlxAdvertiseRequest olxRequest, String token);
	OlxAdvertiseResponse updateAdvertise(int id, OlxAdvertiseRequest olxAdvertiserequest);
	OlxAdvertiseResponse getSpecificAdvertise(int id);
	String DeleteAdvertise(int id);
	List<OlxAdvertiseResponse> getAllAdvertises(int pageNumber, int pageSize);

}
