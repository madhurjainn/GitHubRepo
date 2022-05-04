package com.zensar.olxloginapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olxloginapplication.entity.Olx;

public interface LoginRepository extends JpaRepository<Olx, Integer>{
	

}
