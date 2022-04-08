package com.zensar.entity;



public class Student1 implements Cloneable{

public Object clone()throws CloneNotSupportedException{
return super.clone();
}

public static void main(String[] args) {
Employee e=new Employee(100,"Akash",10000);
Employee e2=(Employee)e.clone();

}
}