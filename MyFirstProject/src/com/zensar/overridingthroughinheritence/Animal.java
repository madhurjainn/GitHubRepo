package com.zensar.overridingthroughinheritence;

public class Animal {
	String color="White";
	

}
class Dog extends Animal{
	String color="Black";
	public void displaycolor() {
		System.out.println("Color of dog is: "+color);
		System.out.println("Default color of animal is: "+super.color);
	}
}

