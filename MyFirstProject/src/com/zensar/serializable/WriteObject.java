package com.zensar.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.zensar.entity.Employee;

public class WriteObject {

	public static void main(String[] args) {
		
		Employee employee=new Employee(100,"Akash",10000);// State of Object we need to store.
		ObjectOutputStream oos=null;
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("abcd.txt"));//ObjectOutputStream takes outputstream argument
			oos.writeObject(employee);//writeObject takes object argument.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
