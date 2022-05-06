package com.zensar.stockapplication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.zensar.stockapplication.entity.Stock;

@SpringBootApplication
public class StockApplication extends SpringBootServletInitializer{
//port no:2020
	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
		
		
		 Stock stock=new Stock(); 
		 stock.getName(); stock.getPrice();
		 
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(StockApplication.class);
	    }

}
