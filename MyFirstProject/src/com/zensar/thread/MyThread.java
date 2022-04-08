package com.zensar.thread;

public class MyThread implements Runnable{
	
	Greeting greeting=null;
	String name=null;
	
	public MyThread(Greeting greeting,String name) {
		this.greeting=greeting;
		this.name=name;
	}

	public void run() {
		greeting.greet(name);
	}
		
	}
