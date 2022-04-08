package StudentManagement;

import java.util.*;
import java.util.Map.Entry;

public class StudentCollectionRepository implements StudentRepository {

	Map<Integer, Student> studentMap = new HashMap<>();

	@Override
	public int acceptStudent(Student student) {
		studentMap.put(student.getStudentId(), student);
		return student.getStudentId();
	}

	@Override
	public void updateStudent(int studentId, String studentName, int studentAge, int rollNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(int studentId) {
		studentMap.remove(studentId);

	}

	@Override
	public void findStudent(int studentId) {
		studentMap.get(studentId);

	}

	@Override
	public void displayallStudents() {
		for (Entry<Integer, Student> entry : studentMap.entrySet())
			System.out.println(entry.getKey() + " :" + entry.getValue());

	}

}
