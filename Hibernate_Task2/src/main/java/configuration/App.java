package configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Doctor;
import model.Patient;
import model.Room;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Doctor d = new Doctor(101, "Ram");

		Patient p = new Patient(201, "Mohan");
		// for one to many
		p.getLst().add(d);

		Room r = new Room(45, "General");
		// for
//		r.getP().add(p);
		r.setPatient(p);

		s.persist(p);
		s.persist(d);
		s.persist(r);
		tx.commit();
		System.out.println(" --------------  Data Inserted Successfully ------------- ");

		System.out.println(" ----------- Here we are Simply trying to Inserting the Data ----------- ");
		System.out.println(p.getLst());

		Patient patient = s.get(Patient.class, 201);

		System.out.println("Patient ID : " + patient.getPid());
		System.out.println("Patient Name : " + patient.getPname());

		System.out.println("Doctors:");

		for (Doctor d1 : patient.getLst()) {
			System.out.println(d1.getDid() + " " + d1.getDname());
		}

		s.close();
		sf.close();

	}
}
