package com.zensar.thread;

public class TestSynchronization {
	public static void main(String[] args) {
		Greeting greeting=new Greeting();
		
		MyThread ramThread=new MyThread(greeting,"Ram");
		MyThread seetaThread=new MyThread(greeting,"Seeta");
		
		Thread t1=new Thread(ramThread);
		Thread t2=new Thread(seetaThread);
		t2.start();
		t1.start();
	}

}
