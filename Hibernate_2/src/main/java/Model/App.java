package Model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Teacher2 t = new Teacher2();

		System.out.println("Enter the Teacher ID :");
		int tid = sc.nextInt();

		System.out.println("Enter the Teacher Name :");
		String tname = sc.next();

		System.out.println("Enter the Teacher Address :");
		String tadd = sc.next();

		System.out.println("Enter the Department :");
		String tdep = sc.next();

		t.setTid(tid);
		t.setTname(tname);
		t.setTadd(tadd);
		t.setTdep(tdep);

		session.persist(t);
		tx.commit();
		session.close();
	}
}
