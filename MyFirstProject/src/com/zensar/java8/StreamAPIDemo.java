package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.zensar.entity.Employee;

public class StreamAPIDemo {

	public static void main(String[] args) {

		// []a= {2,4,6,5,8};
		// IntStream stream=Arrays.stream(a);
		// stream.forEach(c->System.out.print(" "+c));

		// IntStream.iterate(1, n->n+1).limit(25).forEach(i->System.out.println(i));
		/*int a[] = { 4, 3, 7, 1, 9, 6 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);
		// IntStream stream=Arrays.stream(a);
		// stream.sorted().forEach(c->System.out.println(c));

		IntStream stream1 = Arrays.stream(a);
		List<Integer> collect = stream1.boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);*/

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1008, "Chandan", 30000));
		employees.add(new Employee(1004, "Shubham", 80000));
		employees.add(new Employee(1002, "Manish", 50000));
		employees.add(new Employee(1012, "Akash", 100000));
		List<Integer> filteredEmployees=new ArrayList<>();
		
		filteredEmployees=employees.stream().filter(e->e.getEmployeeSalary()>35000).map(e->e.getEmployeeSalary()).collect(Collectors.toList());
		System.out.println(filteredEmployees);
		//Comparator<Employee> empComparator = (Employee e1, Employee e2) -> { 
		//	return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		//};
		Collections.sort (employees,(e1,e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
		//System.out.println(employees);
		Collections.sort(employees,Comparator.comparing(Employee::getEmployeeSalary).reversed());//static method comparing in Comparator interface
		//System.out.println(employees);
		
		List<Employee> abc=employees.stream().filter(u->u.getEmployeeId()>=1004).collect(Collectors.toList());
		//System.out.println("Employees whose greater than or equal to 1004: "+abc);//employee whose id is greater than or equal to 1004
		List<Employee> xyz=employees.stream().filter(w->w.getEmployeeSalary()>=40000).collect(Collectors.toList());
		//System.out.println("Employees whose salary greater than 40000: "+xyz);
		
		List<Integer> increasedSalary=employees.stream().map(b->b.getEmployeeSalary()+1000).collect(Collectors.toList());
		//System.out.println(increasedSalary);
		//System.out.println(employees);
		
	//	List<String> names=Arrays.asList("Rahul","Ravi","Manish","Shubham");
	//	List<String> nameInUpper=names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
	//	System.out.println(nameInUpper);
		//List<Employee> employee=new ArrayList<Employee>();
		//employees.add(new Employee(100, "Akash", 10000,new Address("Bhopal", "MP", 111111)));
		
	/*	List<String> a=Arrays.asList("Apple","Banana");
		List<String> b=Arrays.asList("Papaya","Orange");
		List<String> c=Arrays.asList("Kiwi","Mango");
		List<List<String>> singleList= new ArrayList<>();
		singleList.add(a);
		singleList.add(b);
		singleList.add(c);
		List<String> parentList=singleList.stream().flatMap(e ->e.stream()).collect(Collectors.toList());
		System.out.println("Parent list is: "+parentList);*/
		
		/*String name=null;
		//String name="abc";
		 	Optional<String> z=Optional.ofNullable(name);
		 	z.ifPresent(e->System.out.println(e.toUpperCase()));
		 	z.orElseThrow(()->{
		 		return new RuntimeException("Name not Found");
		 	});
		 	//System.out.println(z.orElse("Not Available"));*/
			List<String> name1=new ArrayList<String>();
			name1.add("Manendra");
			name1.add("Dharmendra");
			name1.add("Surendra");
			name1.add("Ram");
			name1.add("Shyam");
			
			
			
		 	//List<String> name1= Arrays.asList("Manendra","Harendra","Surendra","Dharmendra");
		 	List<String> longNames=new ArrayList<String>();
		 	longNames=name1.stream().filter(n->n.length()>5 && n.length()<9).collect(Collectors.toList());
			//longNames=name1.stream().filter(n->n.length()>5 && n.length()<9).forEach(System.out::println()));
		 	//System.out.println(longNames);
		 	
		 	List<String> words= Arrays.asList("Sky","Forest",null,"Birds","Animals",null);
		 	List<String> resultWords=new ArrayList<String>();
		 	resultWords=words.stream().filter(w->w!=null).collect(Collectors.toList());
		 	System.out.println(resultWords);
		 	
		 	
		 	
		 	
		
		
	}

}
