package com.zensar.exceptions;

import java.util.Scanner;

import com.zensar.exceptions.InvalidIdException;

import StudentManagement.Student;

public class StudentClass {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InvalidIdException {
		int studentId = 0, studentAge = 0, rollNo = 0, counter = 0;
		String studentName = null;
		String enteredValue=null;;
		Student student[] = new Student[10];
		System.out.println("Student Management Application");
		do {
			System.out.println("1.Insert New Student ");
			System.out.println("2.Update Student ");
			System.out.println("3.Deleting the Student");
			System.out.println("4.Find the Student");
			System.out.println("5.Dispaly data:");
			System.out.println("Please select from below options:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			switch (a) {
			case 1:
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter Student Id");
				studentId = scanner1.nextInt();
				System.out.println("Update Age");
				studentAge = scanner1.nextInt();
				System.out.println("Update Roll Number:");
				rollNo = scanner1.nextInt();
				System.out.println("Update Name");
				studentName = scanner1.next();
				Student newStudent = new Student(studentId, studentName, studentAge, rollNo);
				student[counter++] = newStudent;
				break;

			case 2:
				for (int i = 0; i <= student.length; i++) {
					System.out.println("Update Id");
					if (student[i] == null) { // updating existing value
						break;
					} else {
						studentId = sc.nextInt();
						studentName = sc.next();
						studentAge = sc.nextInt();
						rollNo = sc.nextInt();
						student[i] = new Student(studentId, studentName, studentAge, rollNo);
					}
				}
				break;

			case 3:
				Student s1 = new Student();
				s1.delete(student);
				break;
			case 4:
				Student s2 = new Student();
				s2.findId(student);
				break;

			case 5:
				for (int i = 0; i <= student.length; i++) {
					if (student[i] == null) {
						break;

					} else {
						System.out.println(student[i]);
					}
					break;
				}
			}
		}

		while (enteredValue!="y");

		System.out.println("Thank you for using Student Managment Application !!!!");

	}
}
