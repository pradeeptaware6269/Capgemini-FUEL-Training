package confiuration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Student;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student s = context.getBean(Student.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Id of the Student :");
		s.setSid(sc.nextInt());

		sc.nextLine();

		System.out.println("Enter the Name of the Student :");
		s.setSname(sc.nextLine());

		System.out.println("Enter the Address of the Student :");
		s.setSadd(sc.nextLine());

		System.out.println("Enter the Marks of the Student :");
		s.setMarks(sc.nextInt());

		s.display();

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(s);

		tx.commit();

		session.close();
		sf.close();
		sc.close();
		context.close();

		System.out.println("----------- The Given Student Data Is Successfully Added to the Database -------");
	}
}