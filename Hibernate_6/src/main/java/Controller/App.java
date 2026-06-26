package Controller;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Account;
import Model.Employee;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		Account a1 = new Account();
		a1.setAid(101);
		a1.setLocation("Baramati");
		a1.setType("Saving");

		session.persist(a1);

		Account a2 = new Account();
		a2.setAid(102);
		a2.setLocation("Pune");
		a2.setType("Saving");

		session.persist(a2);

		Account a3 = new Account();
		a3.setAid(103);
		a3.setLocation("Mumba");
		a3.setType("Saving");
		session.persist(a3);
		ArrayList<Account> l1 = new ArrayList<Account>();
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);

		Employee emp = new Employee();
		emp.setEid(201);
		emp.setName("Pradeep Taware");
		emp.setDesignation("Assistant");
		emp.setLi(l1);

		session.persist(emp);

		tx.commit();
		session.close();
	}

}
