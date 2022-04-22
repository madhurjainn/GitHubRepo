package com.zensar.stockapplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.el.stream.Optional;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.stockapplication.entity.Stock;

@RestController
@CrossOrigin("http:localhost:4200")//port number 4200 can access the application
//by default url//http://localhost:2009/stocks
@RequestMapping(value="/stocks",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, consumes =MediaType.APPLICATION_XML_VALUE)
public class StockController {
	List<Stock> stocks = new ArrayList<Stock>();

	public StockController() {
		stocks.add(new Stock(100, "RIL", "Nifty", 2610));
		stocks.add(new Stock(200, "Zensar", "Nifty", 342));
		stocks.add(new Stock(300, "Mrf", "Nifty", 50000));
	}
//http://localhost:2009/stocks/test
@RequestMapping(value="/test",method= {RequestMethod.GET,RequestMethod.POST})
public void test() {
	System.out.println("Inside test method");
}
@GetMapping
//@RequestMapping(method= RequestMethod.POST)
public ResponseEntity<Stock> createStock1(@RequestBody Stock stock,@RequestHeader("auth-token")String token){
	if(token.contentEquals("mj66453")) {
		stocks.add(stock);
		
	}else {
		return new ResponseEntity<Stock>(HttpStatus.BAD_REQUEST);
	}
	return new ResponseEntity<Stock>(stock, HttpStatus.CREATED);
}
//Read all stocks
	// http://localhost:2009/stocks
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})  //Handler Method
	//@RequestMapping(method = RequestMethod.GET)
	public List<Stock> getAllStocks() {
		return stocks;
	}
	
//http://localhost:2009/stocks/2 //@PathVariable
//Reading a specific stock
	/*
	 * @GetMapping("/{stockId}")
	 * 
	 * @RequestMapping(value = "/{stockId}", method = RequestMethod.GET) public
	 * Stock getStock(@PathVariable("stockId") int id) { for (Stock stock : stocks)
	 * { if (stock.getStockId() == id) { return stock; } } return null; }
	 
	 */
	//@GetMapping("/{stockId}")
	@RequestMapping(value = "/{stockId}", method = RequestMethod.GET)
	public Stock getStock(@PathVariable("stockId") int id) {
		java.util.Optional<Stock> stock1=stocks.stream().filter(stock->stock.getStockId()==id).findAny();
		if(stock1.isPresent()) {
		return stock1.get();
		}else {
			return stock1.orElseGet(()->{return new Stock();});
		}
	}
	/*
	 * @GetMapping("/stocks") public Stock
	 * getStockByRequestParam(@RequestParam(required=false, value="id", defaultValue
	 * ="100") int id ) { for(Stock stock:stocks) { if(stock.getStockId()==id) {
	 * return stock; } } return null; }
	 */
	//Creating a stock
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, consumes =MediaType.APPLICATION_XML_VALUE)
	//@RequestMapping(value = "/stocks", method = RequestMethod.POST)
	public Stock createStock(@RequestBody Stock stock) {
		stocks.add(stock);
		return stock;
	}

//http://localhost:2009/stocks/200
//Deleting a stock
	
	
	  @DeleteMapping("/{stockId}") public String
	  deleteStock(@PathVariable("stockId") int stockId) { for (Stock stock :
	 stocks) { if (stock.getStockId() == stockId) { stocks.remove(stock); return
	 "Stock deleted Successfully" + stockId; } } return
	 "Sorry Stock is not available"; }
	 
	/*
	 * @DeleteMapping("/{stockId}") public String
	 * deleteStock(@PathVariable("stockId") int stockId) { List dstock=
	 * stocks.stream().filter(stock->stock.getStockId()==stockId).collect(Collectors
	 * .toList()); return "deleted stock is "+dstock; }
	 */
	 
	

	/*
	 *Updating a stock
	 * @PutMapping("/stocks/{stockId}") public String
	 * updateStock(@PathVariable("stockId")int stockId) { for(Stock stock:stocks) {
	 * if(stock.getStockId()==stockId) { stock.setPrice(576.0); return
	 * "Updated stock with stockId: "+stockId;
	 * 
	 * } } return null;
	 * 
	 * }
	 */
	//Updating a Stock
	@PutMapping(value="/{stockId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, consumes =MediaType.APPLICATION_XML_VALUE)
	public Stock updateStock(@PathVariable("stockId") int stockId, @RequestBody Stock stock) {
		Stock availableStock = getStock(stockId);
		availableStock.setMarketName(stock.getMarketName());
		availableStock.setName(stock.getName());
		availableStock.setPrice(stock.getPrice());
		return stock;
	}
	//Delete All stocks
	//http://localhots:2009/stocks - delete
	
	/*
	 * @DeleteMapping public ResponseEntity<String> deleteAllStocks(){
	 * 
	 * stocks.removeAll(stocks);
	 * 
	 * return new
	 * ResponseEntity<String>("All stocks deleted successfully",HttpStatus.OK); }
	 */

}
