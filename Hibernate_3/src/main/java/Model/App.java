package Model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out
				.println("========================= Welcome to the Hibernate Module =============================== ");

		Department d = new Department();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter  1 for the Insert data into the database :");
			System.out.println("Enter  2  for    exit   in    the    system    :");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				try {
					Configuration config = new Configuration();
					config.configure();

					SessionFactory sessionfactory = config.buildSessionFactory();
					Session session = sessionfactory.openSession();
					Transaction tx = session.beginTransaction();

					System.out.println("Enter the dep id:");
					int did = sc.nextInt();

					System.out.println("Enter the dep name :");
					String dname = sc.next();

					System.out.println("Enter the dep location :");
					String dlocation = sc.next();

					System.out.println("Enter the a_num :");
					int A_num = sc.nextInt();

					d.setDid(did);
					d.setDname(dname);
					d.setDlocation(dlocation);
					d.setA_num(A_num);
					session.persist(d);
					tx.commit();
					session.close();
				} catch (Exception e) {
					System.out.println("Exception is :" + e.toString());
				}

				break;

			case 2:
				System.out.println("---------- Here we are exting into the system -------------- ");
				System.exit(0);
				break;

			default:
				System.out.println("------------------- Somthing Else --------");
				break;
			}

		}
	}
}
