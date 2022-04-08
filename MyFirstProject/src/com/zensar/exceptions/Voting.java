package com.zensar.exceptions;

public class Voting {

	public int age(int a) {
		if(a<18){
			try {
				throw new InvalidAgeException("Invalid Age");
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
			
		}else {
		System.out.println("Valid Age");}
		return a;
	}
}
