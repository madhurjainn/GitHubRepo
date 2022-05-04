package com.zensar.stockapplication.service;

import java.util.List;

import com.zensar.stockapplication.dto.StockDto;

public interface StockService {
	List<StockDto> getAllStocks(int pageNumber,int pageSize);
	StockDto createStock(StockDto stock,String token);
	List<StockDto> getStockByItsName(String stockName);

	StockDto getStock( int id);
    String deleteStock( int stockId);
    StockDto updateStock( int stockId, StockDto stock);
	List<StockDto> getStockByItsNameAndPrice(String stockName, double stockPrice);

}
