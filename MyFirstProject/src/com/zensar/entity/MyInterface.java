package com.zensar.entity;

public interface MyInterface {
	public double area();
	
	public default int divide(int a,int b) {
		return (a/b);
	}

}
