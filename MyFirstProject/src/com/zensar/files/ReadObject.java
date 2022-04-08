package com.zensar.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.zensar.entity.Employee;

public class ReadObject {

	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("abcd.txt"));//ObjectInputStream takes Inputstream argument.
			Employee e = (Employee) ois.readObject();//typeCasting
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
