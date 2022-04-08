package com.zensar.exceptions;

public class EnumExample {
	
	public static void main(String[] args) {
		
	
	for(Directions d1: Directions.values()) {
		System.out.println(d1);
	}
	Directions dir=Directions.East;
	if(dir==Directions.East) {
		System.out.println("Correct Direction");
		
	}
}{

}
}
