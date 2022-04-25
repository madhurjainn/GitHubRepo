package com.zensar.stockapplication.service;

import java.util.List;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.stockapplication.entity.Stock;

public interface StockService {
	List<Stock> getAllStocks();
	Stock createStock(Stock stock,String token);
	Stock getStock( int id);
    String deleteStock( int stockId);
    Stock updateStock( int stockId, Stock stock);

}
