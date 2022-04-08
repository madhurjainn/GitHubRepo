package com.zensar.entity;

public class WageEmployee extends Employee {

	private int hours;
	private int rate;

	public WageEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WageEmployee(int employeeId, String employeeName, int employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		// TODO Auto-generated constructor stub
	}

	public WageEmployee(int id, String name, int salary, int hours, int rate) {

		super(id, name, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int calculateSalary() {
		return hours * rate;
	}

	public String toString() {

		return super.toString() + " " + hours + " " + rate + " ";
	}

	public boolean equals(Object obj) { // overriding equals.
		Employee w2 = (Employee) obj;
		if (super.getEmployeeId() == getEmployeeId() && super.getEmployeeName() == getEmployeeName()
				&& super.getEmployeeSalary() == getEmployeeSalary() && this.getHours() == getHours()
				&& this.getRate() == getRate()) {
			return true;
		}
		return false;
	}

}
