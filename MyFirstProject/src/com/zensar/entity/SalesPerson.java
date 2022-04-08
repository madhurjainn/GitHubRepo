package com.zensar.entity;

public class SalesPerson extends WageEmployee {

	public int commission;

	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesPerson(int id, String name, int salary, int hours, int rate, int commission) {
		super(id, name, salary, hours, rate);
		this.commission = commission;

	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int calculateSalary() {
		return super.calculateSalary() + commission;
	}

	public String toString() {
		return super.toString() + commission;
	}

}
