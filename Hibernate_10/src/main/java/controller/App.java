package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Student;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Student s = new Student(101, "Pradeep", "45");
		Student s1 = new Student(102, "Ram Taware", "65");

		Course c = new Course(201, "Jav Full stack");
		Course c1 = new Course(202, "Python Full stack");

		s.getClst().add(c);
		s.getClst().add(c1);

		

		session.persist(s);
		session.persist(s1);

		session.persist(c);
		session.persist(c1);

		tx.commit();
		session.close();
		sessionFactory.close();

		System.out.println("---------------  Data inserted successfully ----------- ");
	}

}
