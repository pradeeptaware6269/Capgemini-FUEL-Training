package Controller;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Employee;
import Model.Locker;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Pradeep Taware");
		e.setEadd("Baramati");
		e.setElocation("Baramti");
		e.setEregNo(2230);

		session.persist(e);

		Employee e1 = new Employee();
		e1.setEid(102);
		e1.setEname("Prathmesh More");
		e1.setEadd("Pune");
		e1.setElocation("Baramti");
		e1.setEregNo(2230);

		session.persist(e1);

		Employee e2 = new Employee();
		e2.setEid(103);
		e2.setEname("Ram Taware");
		e2.setEadd("Baramati");
		e2.setElocation("Baramti");
		e2.setEregNo(2230);

		session.persist(e2);

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);

		Locker l1 = new Locker();
		l1.setAccNo(2230);
		l1.setAccType("Saving");
		l1.setL1(emp);

		session.persist(l1);
		tx.commit();
		session.close();

	}

}
