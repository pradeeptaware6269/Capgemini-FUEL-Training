package configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Faculty;
import model.Student;

public class App {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Faculty faculty = new Faculty(301, "Ram Sir");

		Course course1 = new Course(201, "Java Full Stack");
		Course course2 = new Course(202, "Spring Boot");

		Student student1 = new Student(101, "Pradeep Taware");
		Student student2 = new Student(102, "Rahul");

		course1.setFaculty(faculty);
		course2.setFaculty(faculty);

		faculty.getCourses().add(course1);
		faculty.getCourses().add(course2);

		course1.getStudents().add(student1);
		course1.getStudents().add(student2);

		// Student -> Course
		student1.getCourses().add(course1);
		student2.getCourses().add(course1);

		session.persist(student1);
		session.persist(student2);

		session.persist(course1);
		session.persist(course2);

		session.persist(faculty);

		tx.commit();

		session.close();
		sf.close();

		System.out.println("Data Inserted Successfully...");
	}
}