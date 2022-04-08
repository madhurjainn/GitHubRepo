package com.zensar.entity;

public class TestClass implements MyInterface,MyInterface2{

	public static void main(String[] args) {
		TestClass t=new TestClass();
		System.out.println(t.divide(200, 100));
		// TODO Auto-generated method stub

	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return ((a+b)/b);
		//return MyInterface.super.divide(a, b);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

} 
