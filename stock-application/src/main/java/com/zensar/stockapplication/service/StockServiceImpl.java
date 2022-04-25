package com.zensar.stockapplication.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.stockapplication.entity.Stock;

@Service
public class StockServiceImpl implements StockService {
	static List<Stock> stocks = new ArrayList<Stock>();

	static {
		stocks.add(new Stock(100, "RIL", "Nifty", 2610));
		stocks.add(new Stock(200, "Zensar", "Nifty", 342));
		stocks.add(new Stock(300, "Mrf", "Nifty", 50000));

	}

	@Override
	public List<Stock> getAllStocks() {
		return stocks;
	}

	@Override
	public Stock createStock(Stock stock, String token) {
		if(token.equals("mj66453")) {
			stocks.add(stock);
			return stock;
			}else {
				return null;
			}
	}

	@Override
	public Stock getStock(int id) {
		java.util.Optional<Stock>
		 stock1=stocks.stream().filter(stock->stock.getStockId()==id).findAny();
		 if(stock1.isPresent()) { return stock1.get(); }else { return
		 stock1.orElseGet(()->{return new Stock();}); }
	}

	@Override
	public String deleteStock(int stockId) {
		for (Stock stock :stocks) { 
			  if (stock.getStockId() == stockId) {
				  stocks.remove(stock); 
				  return "Stock deleted Successfully" + stockId; 
				  } 
			  }
		  return "Sorry Stock is not available"; }	

	@Override
	public Stock updateStock(int stockId, Stock stock) {
		Stock availableStock = getStock(stockId);
		availableStock.setMarketName(stock.getMarketName());
		availableStock.setName(stock.getName());
		availableStock.setPrice(stock.getPrice());
		return stock;
	}

	
	
}
