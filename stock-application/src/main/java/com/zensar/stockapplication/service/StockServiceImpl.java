package com.zensar.stockapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.zensar.stockapplication.dto.StockDto;
import com.zensar.stockapplication.entity.Stock;
import com.zensar.stockapplication.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;
	
	//private ModelMapper modelMapper=new ModelMapper();
	@Autowired
	private ModelMapper modelMapper;
	/*
	 * static List<Stock> stocks = new ArrayList<Stock>();
	 * 
	 * static { stocks.add(new Stock(100, "RIL", "Nifty", 2610)); stocks.add(new
	 * Stock(200, "Zensar", "Nifty", 342)); stocks.add(new Stock(300, "Mrf",
	 * "Nifty", 50000));
	 */

	
//http://localhost:2020/stocks?pageNumber=0&pageSize=3
	@Override
	public List<StockDto> getAllStocks(int pageNumber,int pageSize) {
		Page<Stock> pageStocks= stockRepository.findAll(PageRequest.of(pageNumber, pageSize,Sort.by("stockId")));
		List<Stock> content=pageStocks.getContent();
		List<StockDto> stockResponses=new ArrayList<>();
		for(Stock stock:content) {
			StockDto MapToResponse=MapToDto(stock);
			stockResponses.add(MapToResponse);
		}
		return stockResponses;
	}

	@Override
	public StockDto createStock(StockDto stock, String token) {
		//Stock newStock1=MapToStock(stock);
		/*
		 * Stock newStock=new Stock(); newStock.setMarketName(stock.getMarketName());
		 * newStock.setName(stock.getName()); newStock.setPrice(stock.getPrice());
		 */
		Stock newStock=modelMapper.map(stock,Stock.class);
		 if (token.equals("mj66453")) {
			 Stock stock1 = stockRepository.save(newStock);
			 return modelMapper.map(stock1,StockDto.class);
			 } else {
		  return null;
		  }
		
			}
	
	public List<StockDto> getStockByItsName(String stockName) {
		/*By modelMapper
		 * List<Stock> findStockByName=stockRepository.findByName(stockName);
		 * List<StockResponse> stocks=new ArrayList<StockResponse>(); for(Stock
		 * st:findStockByName) { stocks.add(modelMapper.map(st,StockResponse.class)); }
		 * return stocks;
		 */
	List<Stock> findByName=stockRepository.findStockByItsName(stockName);
	List<StockDto> stockResponses = new ArrayList<>();
	for(Stock st:findByName) {
		StockDto mapToResponse = MapToDto(st);
	stockResponses.add(mapToResponse);
	}

	return stockResponses;
	}
	public List<StockDto> getStockByItsNameAndPrice(String stockName,double price) {
		
	List<Stock> findByNameAndPrice=stockRepository.findStockByItsNameAndPrice(stockName, price);
	List<StockDto> stockResponses = new ArrayList<>();
	for(Stock st:findByNameAndPrice) {
		StockDto mapToResponse = MapToDto(st);
	stockResponses.add(mapToResponse);
	}
	return stockResponses;
	}

	@Override
	public StockDto getStock(int stockId) {
		
		Stock stock=stockRepository.findById(stockId).get();
		return modelMapper.map(stock, StockDto.class);
		/*
		 * StockResponse stockResponse=new StockResponse();
		 * stockResponse.setMarketName(stock.getMarketName());;
		 * stockResponse.setName(stock.getName());;
		 * stockResponse.setPrice(stock.getPrice());; return stockResponse;
		 */

		
		
		//return stockRepository.findById(id).get();
		//java.util.Optional<Stock>
	//	 stock1=stocks.stream().filter(stock->stock.getStockId()==id).findAny();
	//	 if(stock1.isPresent()) { return stock1.get(); }else { return
		// stock1.orElseGet(()->{return new Stock();}); }
	}

	@Override
	public String deleteStock(int stockId) {
		stockRepository.deleteById(stockId);
		 return "Stock deleted Successfully" + stockId;
	}

	@Override
	public StockDto updateStock(int stockId, StockDto stock) {
		StockDto stockResponse=getStock(stockId);
		//Stock stock2=MapToStock(stockResponse);
		Stock stock2=modelMapper.map(stock,Stock.class);
		/*if(stock2!=null) {
			stock2.setMarketName(stock.getMarketName());
			stock2.setName(stock.getName());
			stock2.setPrice(stock.getPrice());;
			stock2.setStockId(stockId);*/
			Stock stock3=stockRepository.save(stock2);
			return modelMapper.map(stock3,StockDto.class);
	}


		//return null;
		//Stock availableStock = getStock(stockId);
		//return stockRepository.save(stock);
		/*
		 * Stock availableStock = getStock(stockId);
		 * availableStock.setMarketName(stock.getMarketName());
		 * availableStock.setName(stock.getName());
		 * availableStock.setPrice(stock.getPrice()); return stock;
		 */	//}
	public Stock MapToEntity(StockDto stockRequest) {
		Stock newStock=new Stock();
		newStock.setMarketName(stockRequest.getMarketName());
		newStock.setName(stockRequest.getName());
		newStock.setPrice(stockRequest.getPrice());
		return newStock;
		
	}
	
	public StockDto MapToDto(Stock stock) {
		StockDto stockResponse=new StockDto();
		stockResponse.setStockId(stock.getStockId());
		stockResponse.setMarketName(stock.getMarketName());
		stockResponse.setName(stock.getName());
		stockResponse.setPrice(stock.getPrice());
		return stockResponse;
		
	}
	
	
}
