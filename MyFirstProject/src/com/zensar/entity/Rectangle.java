package com.zensar.entity;

public class Rectangle extends Shape{

	private int length;
	private int breadth;
	
	

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void setLength(int a) {
		length = a;

	}

	public int getLength() {
		return length;

	}

	public void setBreadth(int b) {
		breadth = b;
	}

	public int getBreadth() {
		return breadth;
	}

	public double Area() {
		return length * breadth;

	}
	public double Parameter() {
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(2);
		rectangle.setBreadth(2);
		System.out.println(rectangle.Area());

	}
}
