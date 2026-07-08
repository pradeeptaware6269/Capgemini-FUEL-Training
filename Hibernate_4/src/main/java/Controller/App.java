package Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Account;
import Model.Emp;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Emp e = new Emp();

		e.setEid(101);
		e.setEname("Pradeep");
		e.setEdesignation("Assistant");
		session.persist(e);
		Account a = new Account();

		a.setAccId(1);
		a.setAccType("Saving");
		a.setEmp(e);
		session.persist(a);

		tx.commit();
		session.close();

	}
}
