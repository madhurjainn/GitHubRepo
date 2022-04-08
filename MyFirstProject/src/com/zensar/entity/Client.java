package com.zensar.entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Client implements Cloneable {

	public static double printArea(Shape s) {
		return s.Area();
	}

	public static double printParameter(Shape p) {
		return p.Parameter();
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

	public static void main(String[] args) {

		Circle c = new Circle(9);
	
		Rectangle r = new Rectangle(5, 6);
		System.out.println(Client.printArea(c));
		System.out.println(Client.printArea(r));
		System.out.println(Client.printParameter(c));
		System.out.println(Client.printParameter(r));
		

		try {
			Class className = Class.forName("com.zensar.entity.Employee");
			Method[] methods = className.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
				Constructor constructors[] = className.getConstructors();
				for (int j = 0; j < constructors.length; j++)
					System.out.println(+i + "-" + constructors[j]);
				Field[] fields = className.getDeclaredFields();
				for (int k = 0; k < fields.length; k++)
					System.out.println(fields[k]);
				;
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
