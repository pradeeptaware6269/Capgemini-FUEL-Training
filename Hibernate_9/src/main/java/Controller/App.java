package Controller;

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

		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Pradeep");
		emp.setEsalary(12000);

		session.persist(emp);
		
		Employee emp1 = new Employee();
		emp1.setEid(102);
		emp1.setEname("Ram");
		emp1.setEsalary(12000);

		session.persist(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEid(103);
		emp2.setEname("Pathu");
		emp2.setEsalary(12000);

		session.persist(emp2);

		// Create Department
		Department dep = new Department();
		dep.setDid(201);
		dep.setDname("MCA");
		dep.setEmp(emp);

		session.persist(dep);

		tx.commit();
		session.close();
	}

}
