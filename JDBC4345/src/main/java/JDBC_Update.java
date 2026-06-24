import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update {
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localjhost:3306/collage";
			String username = "root";
			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = con.prepareStatement("update student set sname= ? where sid= ?");

			ps.setString(1, "Suraj");
			ps.setInt(2, 120);

			ps.execute();
			System.out.println("Done-");

			con.close();

		} catch (Exception e) {
			System.out.println("Execption is:" + e);
		} finally {
			System.out.println("i am always execute");
		}
	}

}
