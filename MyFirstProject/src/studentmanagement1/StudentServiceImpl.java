package studentmanagement1;

public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository=new StudentRepositoryImpl();
	
	

	@Override
	public int acceptStudent(int studentId, String studentName, int studentAge) {
		
		Student newStudent = new Student(studentId, studentName, studentAge);

		studentRepository.insertStudent(newStudent);
		
		return  studentId;
	}

	@Override
	public Student[] displayAllStudents() {
		
		return studentRepository.displayAllStudents();
	}

}
