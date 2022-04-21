package com.zensar.olxloginapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.olxloginapplication.entity.Olx;


@SpringBootApplication
public class OlxLoginApplication {
	public static void main(String[] args) {
		SpringApplication.run(OlxLoginApplication.class, args);
		
		Olx userDataList=new Olx();
		userDataList.getId();
}
	}
