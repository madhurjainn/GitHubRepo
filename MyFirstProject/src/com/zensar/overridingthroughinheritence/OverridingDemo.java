package com.zensar.overridingthroughinheritence;


class Bank{
	
	public double rateOfInterest() {
		return 0;
	}
}
class Icici extends Bank{
	public double rateOfInterest() {
		return 6.5;
	}
}
class Axis extends Bank{
	public double rateOfInterest() {
		return 7.5;
	}
}
class Kotak extends Bank{
	public double rateOfInterest() {
		return 8.5;
	}
}

public class OverridingDemo {
	
	public static void main(String[] args) {
		Icici icici=new Icici();
		System.out.println("rate of interest of ICICI is: "+icici.rateOfInterest());
		Axis axis=new Axis();
		System.out.println("rate of interest of ICICI is:"+axis.rateOfInterest());
		Kotak kotak =new Kotak();
		System.out.println("rate of interest of ICICI is:"+ kotak.rateOfInterest());
	}
	
	

}
