package com.zensar.collection;

import java.util.TreeSet;

import com.zensar.entity.Employee;

public class Class1 {
	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Akash", 10000);
		Employee e2 = new Employee(101, "Farukh", 20000);
		Employee e3 = new Employee(102, "Dan", 30000);

		 TreeSet s=new TreeSet();//-Comparing by Id(Integer)
		 s.add(e1);//Employee Class must implement Comparable interface and override
		
		 s.add(e2);
		 s.add(e3);
		 System.out.println(s);

		// COMPARING BY NAME (String) To sort by name comparator interface
		// must be implemented by NameComparator
		// class with overriding its method compareTo().
		TreeSet s1 = new TreeSet(new NameComparator());
		s1.add(e1);// Employee Class must implement Comparator interface and override compareTo
					// method.
		s1.add(e2);
		s1.add(e3);
		System.out.println(s1);

	}
}