package com.zensar.collection;
import java.util.Comparator;

import com.zensar.entity.Employee;

public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(e1.getEmployeeSalary()>e2.getEmployeeSalary()) {
			return 1;
		}
		if(e1.getEmployeeSalary()<e2.getEmployeeSalary()) {
			return -1;
		}
		if(e1.getEmployeeSalary()==e2.getEmployeeSalary()) {
			return 0;
		}
		
		
		
		return 0;
	}
		
	}


