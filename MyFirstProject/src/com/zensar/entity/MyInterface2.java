package com.zensar.entity;

public interface MyInterface2 {
	public default int divide(int a,int b) {
		return (b/a);
	}

}
