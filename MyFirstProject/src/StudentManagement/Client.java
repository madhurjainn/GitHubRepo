package StudentManagement;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		StudentService studentService = new StudentServiceImpl();

		int studentId = 0, studentAge = 0;
		String studentName = null, enteredValue = null;

		do {
			System.out.println("Welcome to Student Managment Application");

			System.out.println(" 1 : Inserting Student");

			System.out.println(" 2 : Display all students");

			System.out.println("Please enter your choice");

			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Please enter student Id");
				studentId = scanner.nextInt();
				System.out.println("Please enter student Name");
				studentName = scanner.next();
				System.out.println("Please enter student Age");
				studentAge = scanner.nextInt();

				int id = studentService.acceptStudent(studentId, studentName, studentAge);

				System.out.println("Student registered successfullyyy with student id " + id);

				break;
			case 2:

				Student[] allStudents = studentService.displayAllStudents();

				for (Student student : allStudents) {
					if (student != null)
						System.out.println(student);
				}

				break;
			}

			System.out.println("Do you want to continue (y/n)");
			enteredValue = scanner.next();

		} while (enteredValue.equalsIgnoreCase("y"));

		System.out.println("Thank you for using Student Managment Application !!!!");

	}

}
