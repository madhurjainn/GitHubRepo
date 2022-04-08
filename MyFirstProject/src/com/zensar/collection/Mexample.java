package com.zensar.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


import com.zensar.entity.Employee;

public class Mexample {
	public static void main(String[] args) {
		Map m=new HashMap();
		Employee e1=new Employee(105,"Akash",10000);
		Employee e2=new Employee(104,"Dan",20000);
		Employee e3=new Employee(103,"Ben",30000);
		
		m.put(e1.getEmployeeId(), e1);
		m.put(e2.getEmployeeId(), e2);
		m.put(e3.getEmployeeId(), e3);
	//	System.out.println(m);
	//	System.out.println(m.get(e2.getEmployeeId()));
		Set keys= m.keySet();
		Iterator iterator=keys.iterator();
		while( iterator.hasNext()) {
			Integer i=(Integer)iterator.next();
			System.out.println(m.get(i) );
			
			
		}
		
		
	}

}
