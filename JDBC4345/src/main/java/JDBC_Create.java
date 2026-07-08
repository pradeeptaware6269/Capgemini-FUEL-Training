import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Create {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/collage";
			Connection con = DriverManager.getConnection(url, "root", "root");

			Statement st = (Statement) con.createStatement();

			String query = "create table stu(rollno int, name varchar(30), age int)";

			((java.sql.Statement) st).executeUpdate(query);

			System.out.println("Table Created Successfully");

		} catch (Exception e) {
			System.out.println("Exception :" + e);
		} finally {
			System.out.println("I am Always Execute ");
		}
	}

}
