import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Insert {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Student ID :");
			int sid = sc.nextInt();

			System.out.println("Enter the Student Name  :");
			String sname = sc.next();

			System.out.println("Enter the student age :");
			int sage = sc.nextInt();

			System.out.println("Enter the Student Address :");
			String sadd = sc.next();

			String url = "jdbc:mysql://localhost:3306/collage";
			String username = "root";
			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");

			ps.setInt(1, sid);
			ps.setString(2, sname);
			ps.setInt(3, sage);
			ps.setString(4, sadd);

			ps.executeUpdate();

			con.close();

			System.out.println("Done");
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		} finally {
			System.out.println("Execution is Done !!!");
		}
	}
}
