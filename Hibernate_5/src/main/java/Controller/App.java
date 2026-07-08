package Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Locker;
import Model.Person;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		PersonControl per = new PersonControl();

		LockerControl loc = new LockerControl();

		Person p = per.getPersonControl();
		Locker l = loc.getLockerControl();

		l.setPer(p);

		session.persist(p);

		session.persist(l);

		tx.commit();

		session.close();
		sessionFactory.close();

		System.out.println("Data Inserted Successfully...");
	}
}