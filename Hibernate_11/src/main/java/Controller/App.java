package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Department;
import Model.Employee;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Scanner sc = new Scanner(System.in);

		// Department
		Department d = new Department();
		d.setDid(201);
		d.setDname("MCA");

		// Employee List
		List<Employee> employees = new ArrayList<>();

		while (true) {

			Employee emp = new Employee();
			System.out.println("\nEnter Employee Details");

			System.out.print("Employee ID: ");
			emp.setEid(sc.nextInt());

			System.out.print("Employee Name: ");
			emp.setEname(sc.next());

			sc.nextLine();
			System.out.print("Employee Address: ");
			emp.setEadd(sc.nextLine());

			employees.add(emp);

			session.persist(emp);

			System.out.print("Add another employee? (yes/no): ");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				break;
			}
		}

		d.setLst(employees);

		session.persist(d);

		tx.commit();

		session.close();
		sessionFactory.close();
		sc.close();

		System.out.println("\nAll Employees Saved Successfully.");
	}
}
