package com.zensar.olxloginapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.olxloginapplication.entity.Olx;
@Repository
public interface LoginRepository extends JpaRepository<Olx, Integer>{
	
	@Query(value="select * from olx where first_Name=:name",nativeQuery=true)
	List<Olx> findOlxByFirstName(@Param("name") String firstName);
}

