package studentmanagement1;

public interface StudentRepository {
	
	int insertStudent(Student student); 
	
	Student[] displayAllStudents();

}
