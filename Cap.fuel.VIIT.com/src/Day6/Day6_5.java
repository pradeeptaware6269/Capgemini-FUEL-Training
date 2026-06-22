package Day6;

import java.util.Scanner;

public abstract class Day6_5 {
	double sal = 1200;
	String name = "Pradeep";
	String add = "Pune";

	// Abstract Method
	abstract void input1();

	// Normal Method
	void print() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Salary :");
		sal = sc.nextDouble();

		System.out.println("Enetr the name :");
		name = sc.next();

		System.out.println("Enter the add :");
		add = sc.next();

	}

}
