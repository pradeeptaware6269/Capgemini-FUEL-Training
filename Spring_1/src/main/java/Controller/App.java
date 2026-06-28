package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Doctor;
import model.Nurse;
import model.Patient;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		System.out.println(doctor.getQualification());

		System.out.println("================================================== ");

		Nurse nurse = context.getBean(Nurse.class);
		nurse.assist();
		System.out.println(nurse.getEducation());

		System.out.println("================================================== ");
		Patient patient = context.getBean(Patient.class);
		patient.assits();
		System.out.println(patient.getBloodGroup());

	}

}
