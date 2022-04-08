package com.zensar.exceptions;

public enum Directions {

	East(1),West(2),North(3),South(4);
	
Directions(int directions){
	System.out.println("Direction Number:"+directions);
}
}
