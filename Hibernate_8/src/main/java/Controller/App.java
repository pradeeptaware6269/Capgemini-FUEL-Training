package Controller;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;

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

		ArrayList<Employee> e = new ArrayList<Employee>();

		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Pradeep Taware");
		emp.setEsalary(12000);
		session.persist(emp);

		Employee emp1 = new Employee();
		emp1.setEid(102);
		emp1.setEname("Patya More");
		emp1.setEsalary(12000);
		session.persist(emp1);

		Employee emp2 = new Employee();
		emp2.setEid(103);
		emp2.setEname("Patya Jangam");
		emp2.setEsalary(15000);
		session.persist(emp2);

		e.add(emp);
		e.add(emp1);
		e.add(emp2);

		Department d = new Department();
		d.setDid(2301);
		d.setDname("MCA");
		d.setEmp(e);

		session.persist(d);

		tx.commit();

		session.close();
		sessionFactory.close();
	}
}