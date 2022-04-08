package com.zensar.entity;

public class Circle extends Shape{
	private int radius;
	
	

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(int r) {
		radius = r;

	}

	public int getRadius() {
		return radius;
	}

	public double Area() {

		return 3.14 * radius * radius;

	}
	public double Parameter() {
		return 3.14*2*radius;
	}

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(3);
		System.out.println(circle.Area());

	}
}
