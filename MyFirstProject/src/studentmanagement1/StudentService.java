package studentmanagement1;

public interface StudentService {
	
	int acceptStudent(int studentId,String StudentName,int studentAge); 
	
	Student[] displayAllStudents();

}
