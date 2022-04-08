package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
  
  
}

	


public class FilterDemo {
	public static void main(String[] args) {
		  List<Product> productsList= new ArrayList<>();
		  productsList.add(new Product(1, "HP", 25000));
		  productsList.add(new Product(1, "Dell", 28000));
		  productsList.add(new Product(1, "Lenovo", 35000));
		  productsList.add(new Product(1, "Acer", 30000));
		  productsList.add(new Product(1, "Apple", 22000));
		  List<Product> mainLaptopsprice=new ArrayList<>();
		 mainLaptopsprice= productsList.stream().filter(p->p.getPrice()>25000.0).collect(Collectors.toList());
		 System.out.println(mainLaptopsprice);
		  
		
	}}

