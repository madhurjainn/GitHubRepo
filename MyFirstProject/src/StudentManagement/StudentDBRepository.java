package StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.zensar.database.ConnectionProvider;

public class StudentDBRepository implements StudentRepository {
	Connection con = null;
	PreparedStatement psmt = null;
	Scanner scanner = new Scanner(System.in);

	@Override
	public int acceptStudent(Student student) {
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement psmt = con.prepareStatement("insert into Student values(?,?,?)");) {
			System.out.println("Enter the student Id: ");
			int studentId = scanner.nextInt();
			System.out.println("Enter student name: ");
			String studentName = scanner.next();
			System.out.println("Enter student age: ");
			int studentAge = scanner.nextInt();
			System.out.println("Enter student roll no: ");
			int rollNo = scanner.nextInt();
			psmt.setInt(1, studentId);
			psmt.setString(2, studentName);
			psmt.setInt(3, studentAge);
			psmt.setInt(4, rollNo);
			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("Data Stored Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	public void updateStudent(Student student) {
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement psmt = con.prepareStatement("Update Student set studentName=?,studentAge=?,rollNo=? where studentId=?");) {
			System.out.println("Enter the student Id you want to update: ");
			int studentId1 = scanner.nextInt();
			System.out.println("Enter student name: ");
			String studentName1 = scanner.next();
			System.out.println("Enter student age: ");
			int studentAge1 = scanner.nextInt();
			System.out.println("Enter student rollno: ");
			int rollNo1 = scanner.nextInt();
			psmt.setInt(1, studentId1);
			psmt.setString(2, studentName1);
			psmt.setInt(3, studentAge1);
			psmt.setInt(4, rollNo1);
			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("Record Updated Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		

	

	@Override
	public void deleteStudent(int studentId) {
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement psmt = con.prepareStatement("delete from Student where studentId=?");) {
			System.out.println("Enter the student Id you want to delete: ");
			int studentId1 = scanner.nextInt();
			System.out.println("Enter student name: ");
			psmt.setInt(1, studentId1);
			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("Record Updated Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void findStudent(int studentId) {
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement psmt = con.prepareStatement("select from Student where studentId=?");) {
			System.out.println("Enter the student Id you want to delete: ");
			int studentId1 = scanner.nextInt();
			psmt.setInt(1, studentId1);
			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("Record Updated Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

	@Override
	public void displayallStudents() {
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement psmt = con.prepareStatement("select from Student");) {
			System.out.println("Records of students is below: ");
			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("Record Updated Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
