package com.zensar.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.zensar.entity.Employee;

public class TreesSetExample {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		Employee e1=new Employee(1020, "Ben", 10000);
		Employee e2=new Employee(1010, "Akash", 30000);
		Employee e3=new Employee(1040, "Dan", 20000);//same HashCode
		Employee e4=new Employee(1040, "Dan", 20000);//same HashCode
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		Map<Integer,Employee> map=new HashMap();
		map.put(e1.getEmployeeId(), e1);
		map.put(e2.getEmployeeId(), e2);
		map.put(e3.getEmployeeId(), e3);
		for(Map.Entry<Integer,Employee> i: map.entrySet()) {
			System.out.println(i.getKey()+" :"+i.getValue());
		}
		
		
		

	}

}
