package studentmanagement1;

public class StudentRepositoryImpl implements StudentRepository {
	
	Student student[] = new Student[5];
	int counter=0;

	@Override
	public int insertStudent(Student student) {
		this.student[counter++]= student;
		return student.getStudentId();
		
	}

	@Override
	public Student[] displayAllStudents() {
		return student;
	}

}
