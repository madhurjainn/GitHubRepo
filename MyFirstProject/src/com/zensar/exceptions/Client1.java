package com.zensar.exceptions;

import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {

		int a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age");
		a = scanner.nextInt();
		Voting v = new Voting();
		v.age(a);
		
		
	}
}
