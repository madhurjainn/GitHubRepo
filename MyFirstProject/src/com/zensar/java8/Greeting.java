package com.zensar.java8;
@FunctionalInterface
public interface Greeting {
	
	public void greet(String name);

}
/*class Greetingimpl implements Greeting{

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		
	}
	

}
*/

class Test {
	public static void main(String[] args) {
		/*Greeting greeting=new Greeting() {
		public void greet(String name) { //implementing Greeting interface through anonymous inner class.
		System.out.println("Hello "+name);	
		}
		};
		greeting.greet("Madhur");*/
		Greeting greeting=(String name)->{ //Providing Lambda Expression for @FunctionalInterface. 
			System.out.println("Hello "+name);
		};
		greeting.greet("Madhur");
		
		}}
		

