package StudentManagement;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository=new StudentDBRepository();

	
	
	public void updateStudent(int studentId, String studentName, int studentAge, int rollNo) {
		Student[] student = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<student.length; i++) {
			do {
				studentId = sc.nextInt();
				studentName = sc.next();
				studentAge = sc.nextInt();
				rollNo = sc.nextInt();
				student[i] = new Student(studentId, studentName, studentAge, rollNo);
				System.out.println("Data updated Sucessfully");
			} while ((student[i] != null));
		}
	}

	
	public void deleteStudent(int studentId) {
	
		studentRepository.deleteStudent(studentId);
		}
	
	public void findStudent(int studentId) {
		
			studentRepository.findStudent(studentId);
		}

	
	public void displayallStudents() {
		studentRepository.displayallStudents();
	

}
	


	public int acceptStudent(Student student) {
		Student newStudent= new Student(student);
		int result=studentRepository.acceptStudent(newStudent);
		return result;
	}


	@Override
	public int acceptStudent(int studentId, String studentName, int studentAge, int rollNo) {
		// TODO Auto-generated method stub
		return 0;
	}



	
}
