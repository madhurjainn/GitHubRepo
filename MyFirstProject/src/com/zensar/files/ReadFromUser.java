package com.zensar.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromUser {

	public static void main(String[] args) {
		String s = null;

		FileOutputStream fos = null;

		System.out.println("Enter Name:");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		try {

			fos = new FileOutputStream("pqr.txt");

			byte[] bytes = s.getBytes();//converting into bytes
			fos.write(bytes);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
