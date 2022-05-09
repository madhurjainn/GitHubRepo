package com.zensar.olxadvertiseapplication.advertiseservice;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.zensar.olxadvertiseapplication.dto.AdvertiseDto;
import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;
public interface OlxAdvertiseService {
	AdvertiseDto createNewAdvertise(AdvertiseDto olxRequest, String token);
	AdvertiseDto updateAdvertise(int id, AdvertiseDto olxAdvertiserequest);
	AdvertiseDto getSpecificAdvertise(int id);
	String DeleteAdvertise(int id);
	List<AdvertiseDto> getAllAdvertises();
	List<AdvertiseDto> findOlxMasterByCategory(String category1);

}
