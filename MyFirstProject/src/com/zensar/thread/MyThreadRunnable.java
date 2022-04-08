package com.zensar.thread;

public class MyThreadRunnable implements Runnable{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals(("t1"))) {
			for(int i=0;i<10;i++) {
				System.out.println("Ram");
			}
		}
	
		if(Thread.currentThread().getName().equals(("t2"))) {
			for(int i=0;i<10;i++) {
				System.out.println("Seeta");
			}
		}
		
	}

}
