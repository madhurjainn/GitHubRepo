package com.zensar.olxloginapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olxloginapplication.entity.Olx;
@Repository
public interface LoginRepository extends JpaRepository<Olx, Integer>{
	

}
