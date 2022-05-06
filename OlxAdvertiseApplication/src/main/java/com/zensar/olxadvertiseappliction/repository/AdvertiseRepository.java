package com.zensar.olxadvertiseappliction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.zensar.olxadvertiseapplication.entity.OlxAdvertises;
public interface AdvertiseRepository extends JpaRepository<OlxAdvertises, Integer>{

}
