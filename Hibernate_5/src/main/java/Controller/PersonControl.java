package Controller;

import java.util.Scanner;

import Model.Person;

public class PersonControl {
	public Person getPersonControl() {

		Scanner sc = new Scanner(System.in);
		Person p = new Person();

		System.out.println("Enter the Person Id :");
		p.setPid(sc.nextInt());
		sc.nextLine();

		System.out.println("Enetr the Person Name :");
		p.setPname(sc.next());

		sc.nextLine();

		System.out.println("Enter the Person Address :");
		p.setPadd(sc.next());
		sc.nextLine();

		System.out.println("Enter the Person Age :");
		p.setAge(sc.nextInt());
		sc.nextLine();

		return p;

	}

}
