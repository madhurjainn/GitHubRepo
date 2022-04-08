package StudentManagement;

import java.util.Scanner;

import com.zensar.exceptions.InvalidIdException;

public class StudentClass {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InvalidIdException {
		StudentService service = new StudentServiceImpl();
		int studentId = 0, studentAge = 0, rollNo = 0, counter = 0;
		String studentName = null;
		String enteredValue = null;
		;

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

			Object student;
			switch (a) {
			case 1:

				int id = service.acceptStudent(student);
				System.out.println("Data stored Successfully");
				break;

			case 2:

				System.out.println("Update Id");
				int newId = sc.nextInt();
				service.updateStudent(studentId, studentName, studentAge, rollNo);
				break;

			case 3:

				
				System.out.println("Enter Id you want to delete:");
				int id1 = sc.nextInt();
				service.deleteStudent(studentId1);
				//System.out.println("Student data deleted successfully");
				break;
			case 4:
				System.out.println("Enter Id you want to find:");
				int studentId1 = sc.nextInt();
				service.findStudent(studentId1);
				break;

			case 5:

				service.displayallStudents();
				break;

			}// switch block
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Do you want to continue?");
			enteredValue = sc3.next();

		} while (enteredValue != "n");

	}// do block

	{

		System.out.println("Thank you for using Student Managment Application !!!!");
	}// while

}
