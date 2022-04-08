package com.zensar.thread;
public class Client {
public static void main(String[] args) {
	Greeting greeting=null;
	String name=null;
MyThread myThread = new MyThread(greeting,name);
Thread t1=new Thread(myThread, "t1");
//t1.setName("t1");
t1.start();
//System.out.println(t1.getName());

//MyThread myThread1 = new MyThread();
Thread t2=new Thread(myThread,"t2");
//t2.setName("t2");
t2.start();
//System.out.println(t2.getName());

System.out.println("Exit");
//System.out.println(Thread.currentThread().getName());

}
}