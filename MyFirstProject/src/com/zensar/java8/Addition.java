package com.zensar.java8;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.zensar.entity.Employee;

@FunctionalInterface
public interface Addition {
	public int add(int a,int b);

}
class TestAdd{
	public static void main(String[] args) {
		ArrayList names= new ArrayList();
		names.add("Rahul");
		names.add("Suresh");
		Employee e=new Employee();
		//names.forEach(e::printEmployee);
		//names.forEach(name->System.out.println(name));
		
	
	/*Addition addition=(a,b)->a+b;//brackets are not mandatory if there is one statement
	System.out.println(addition.add(100,400));
	Predicate<Integer> p=(i)->{
		if(i>10) {                   //implementing abstract test() method of Predicate Interface.
			return true;
		}
		else {
			return false;
		}
	};
	System.out.println(p.test(10));
	Predicate<Integer> p1=(input)->input%2==0;
	System.out.println(p1.test(10));
	
	Consumer<String> c=(String name)-> System.out.println(name);//Implementing accept() method ofConsumer Functional interface
	c.accept("RAM");
	Supplier<String> s=()->"Hello Java";
	System.out.println(s.get());
	Function<Integer,String> f=(i)->{
		return "Hello";
	
};
System.out.println(f.apply(10));*/
}}
