package StudentManagement;

import java.util.Scanner;

import com.zensar.exceptions.NotAvailableException;

public class Student {

	public int studentId;
	public String studentName;
	public int studentAge;
	public int rollNo;;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int studentAge, int rollNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.rollNo = rollNo;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void delete(Student[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id you want to delete:");
		int id = sc.nextInt();
		for (int i = 0; i <= arr.length; i++) {
			if (id == arr[i].getStudentId()) {
				for (int j = 0; j < arr.length; j++) {
					arr[j] = null;
					;
				}
			} else {
				try {
					throw new NotAvailableException();
				} catch (NotAvailableException e) {
					System.out.println("Id unavailable");
				}
			}
		}
	}

	public void findId(Student[] arr) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter Id you want to search:");
		int id = s2.nextInt();
		for (int j = 0; j <= arr.length; j++) {
			if (id == arr[j].getStudentId()) {
				System.out.println(arr[j]);
			}

			else {
				break;
			}
		}

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", rollNo=" + rollNo + "]";
	}

}
