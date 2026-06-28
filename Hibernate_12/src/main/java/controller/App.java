package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Customer;
import model.Product;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory sf = config.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Customer c = new Customer(101, "ram", "Baramati");
		Customer c1 = new Customer(102, "Ram", "Pune");

		Product p = new Product(201, "Laptop", 45000);
		Product p1 = new Product(202, "PC", 78000);

		c.getLst().add(p);
		c1.getLst().add(p1);

		p.getLst().add(c);
		p.getLst().add(c1);

		s.persist(c);
		s.persist(c1);
		s.persist(p);
		s.persist(p1);

		tx.commit();
		s.close();
		sf.close();
		System.out.println("------------ Here data is inserted Successfully ------------ ");

	}
}
