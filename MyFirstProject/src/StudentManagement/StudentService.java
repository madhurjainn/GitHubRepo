package StudentManagement;

public interface StudentService {

	int acceptStudent(int studentId, String studentName, int studentAge, int rollNo);
	void updateStudent(int studentId, String studentName, int studentAge, int rollNo);
	void deleteStudent(int studentId);
	void findStudent(int studentId);
	void displayallStudents();
	
	
}
