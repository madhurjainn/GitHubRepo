package StudentManagement;

public interface StudentRepository {

	int acceptStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	void findStudent(int studentId);
	void displayallStudents();
	
}
