package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.List;

import com.zensar.olxadvertiseapplication.dto.AdvertiseDto;

public interface OlxAdvertiseService {
	AdvertiseDto createNewAdvertise(AdvertiseDto olxRequest, String token);
	AdvertiseDto updateAdvertise(int id, AdvertiseDto olxAdvertiserequest);
	AdvertiseDto getSpecificAdvertise(int id);
	String DeleteAdvertise(int id);
	List<AdvertiseDto> getAllAdvertises();

}
