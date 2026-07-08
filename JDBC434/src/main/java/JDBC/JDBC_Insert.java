package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Insert {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		try {
			String url = "jdbc:mysql://localhost:3306/company";
			String user = "root";
			String pass = "root";

			int eid;
			String ename, email;
			double esal;

			// 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();

			// 2
			while (true) {

				System.out.println("Enter 1 for the insert values :");
				System.out.println("Enter 2 for the Print All data");
				System.out.println("Enter 3 for the Update Emp data ");
				System.out.println("Enter 4 for the Delete Emp data ");
				System.out.println("Enter 5 for the EXit System ");

				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Here we can simply Insert the Data into the Employee Table :");

					System.out.println("Enter the Emplyee eid:");
					eid = sc.nextInt();

					System.out.println("Enter the Employee ename :");
					ename = sc.next();

					System.out.println("Enter the Employee Email :");
					email = sc.next();

					System.out.println("Enter the Employee salary :");
					esal = sc.nextDouble();

					String query = "insert into emp values('" + eid + "','" + ename + "','" + email + "','" + esal
							+ "')";

					st.executeUpdate(query);
					System.out.println("Done");

					break;

				// For Printing the Data
				case 2:

					System.out.println("Here we are printing the Employee Table Data :");

					String query1 = "select * from emp";

					ResultSet rs = st.executeQuery(query1);

					while (rs.next()) {
						System.out.println(
								rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
					}
					System.out.println("The data is printed Successfully");
					break;

				// Update Employee Data
				case 3:
					System.out.println("Here we are trying to the Update The EMP Data :");

					System.out.println("Enter the Emp id for Upadating :");
					int eid1 = sc.nextInt();

					System.out.println("Enter the Emp Name for Updating :");
					String ename1 = sc.next();

					String query2 = "update emp set ename='" + ename1 + "' where eid='" + eid1 + "'";

					st.execute(query2);
					break;

				// For deleting the data
				case 4:
					System.out.println("Here we are trying to the Deleting the EMP Data using the Emplyee id :");

					System.out.println("Enter the Emp id for Deleting :");
					int eid3 = sc.nextInt();

					String query3 = "delete from emp where eid='" + eid3 + "'";
					st.execute(query3);
					break;

				// exit for the system
				case 5:
					System.out.println("Here we can exiting to the system ...... good Bye ");
					System.exit(0);
					break;

				default:
					System.out.println("--------- Something Wents Wrong ----------- ");
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("The Exception is :" + e.toString());
		} finally {
			System.out.println("I am always Execute ");
		}
	}
}
