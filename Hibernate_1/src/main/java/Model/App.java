package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		Student s = new Student();
		s.setSid(101);
		s.setSname("Pradeep");
		s.setSadd("Pune");

		session.persist(s);
		tx.commit();
		session.close();

	}

}
