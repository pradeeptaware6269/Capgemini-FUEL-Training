package Day6;

import java.util.Scanner;

public class Day6_8Class2 extends Day6_8Class1 {

	int mar;
	int math;
	int sci;
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter mar marks :");
		mar = sc.nextInt();

		System.out.println("Enter the math marks :");
		math = sc.nextInt();

		System.out.println("Enetr the sci marks :");
		sci = sc.nextInt();

	}

	public void display() {
		System.out.println("The marathi marks is :" + mar);
		System.out.println("the math marks is :" + math);
		System.out.println("The sci marks :" + sci);
	}

}
