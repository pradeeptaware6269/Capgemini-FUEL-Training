package Day6;

import java.util.Scanner;

public class Day6_8Class1 {

	int id;
	String name;
	int age;

	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter the id :");
		id = sc.nextInt();
		System.out.println("Enter the name :");
		name = sc.next();
		System.out.println("Enter the age :");
		age = sc.nextInt();
	}

	public void display() {
		System.out.println("The Id of the Students is :" + id);
		System.out.println("The Name of the students is :" + name);
		System.out.println("The Age of the Students is :" + age);
	}

}
