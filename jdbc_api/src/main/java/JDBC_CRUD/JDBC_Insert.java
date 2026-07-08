package JDBC_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {

			String url = "jdbc:mysql://localhost:3306/collage";
			String username = "root";
			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			// for the Insert Operation

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");

			ps.setInt(1, 120);
			ps.setString(2, "Karan");
			ps.setInt(3, 22);
			ps.setString(4, "Sharadanagar");

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
