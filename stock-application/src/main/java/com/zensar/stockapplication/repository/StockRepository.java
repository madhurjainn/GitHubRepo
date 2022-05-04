package com.zensar.stockapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zensar.stockapplication.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{
	
	@Query("FROM MyStock s where s.name=?1")
	List<Stock> findStockByItsName(String name);
	@Query("FROM MyStock s where s.name=?1 and s.price=?2")

	List<Stock> findStockByItsNameAndPrice(String name,double price);
}
