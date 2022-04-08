package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
	int id;
	String name;
	String grade;

	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}

public class FlatMapDemo2 {
	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		student.add(new Student(10, "Akash", "A"));
		student.add(new Student(11, "Ayush", "B"));
		student.add(new Student(12, "Manish", "C"));

		List<Student> student1 = new ArrayList<Student>();
		student1.add(new Student(13, "Bharat", "D"));
		student1.add(new Student(14, "Bheem", "E"));
		student1.add(new Student(15, "Bhanu", "F"));

		List<List<Student>> studentList = Arrays.asList(student, student1);
		List<Student> finalStudentList = studentList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		// System.out.println(finalStudentList);

		List<String> vehicles = Arrays.asList("Bus", "Car", "Cycle", "Bike", "Car", "Bus");
		List<String> vehicleString = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(vehicleString);

		long count = vehicles.stream().distinct().count();
		System.out.println(count);

		List<String> limitedVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehicles);

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 9, 10);
		long evenNumbers = numberList.stream().filter(n -> n % 2 == 0).count();
		System.out.println(evenNumbers);

		Optional<Integer> maxNumber = numberList.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(maxNumber.get());

		Optional<Integer> minNumber = numberList.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(minNumber.get());

		List<String> newString = Arrays.asList("A", "B", "C", "1", "2", "3");
		Optional<String> reduce = newString.stream().reduce((value, combinedValue) -> {
			return combinedValue + " " + value;
		});
		System.out.println(reduce.get());

		Object[] arr =  newString.stream().toArray();
		System.out.println(arr);

	}

}
