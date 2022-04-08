package com.zensar.entity;

import java.io.Serializable;
import java.util.List;

import com.zensar.java8.Address;

public class Employee implements Serializable,Comparable{

	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private List<Address> address;

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Employee(int employeeId, String employeeName, int employeeSalary, List<Address> address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int calculateSalary() {
		return 0;
	}

	public String toString() {
		return employeeId + " " + " " + employeeName + " " + employeeSalary;
	}
	public static void printEmployee(String name) {
		System.out.println(name);
	}
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Employee e2=(Employee) o;
		
		if(this.getEmployeeId()>e2.getEmployeeId()) {
			return 1;
		}
		if(this.getEmployeeId()<e2.getEmployeeId()) {
			return -1;
		}
		if(this.getEmployeeId()==e2.getEmployeeId()) {
			return 0;
		}
		
		
		
		return 0;
	}
	

}
