import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDEMO {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//this line is optional for current java //ClassNotFoundException
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com:/batch22", "root", "ZensarRoot");//SQLException
			//Connection con = DriverManager.getConnection(
				//	"jdbc:mysql://localhost:3306/batch22", "root", "root");
			//or
			//Connection con = DriverManager.getConnection(
			//	"jdbc:mysql://127.0.0.1:3306/batch22", "root", "root");

			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getInt(3));
			}
			String s =con.
			System.out.println("Connected.");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	
}
