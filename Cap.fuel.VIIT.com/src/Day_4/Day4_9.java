package Day_4;

import java.util.Scanner;

public class Day4_9 {
	int a, b;

	Scanner sc = new Scanner(System.in);
	int sum, sub, mul, div, dNo;

	public void sum() {
		System.out.println("Enter First No :");
		a = sc.nextInt();

		System.out.println("Enter Second No :");
		b = sc.nextInt();
		sum = a + b;

	}

	public void sub() {
		System.out.println("Enter First No :");
		a = sc.nextInt();

		System.out.println("Enter Second No :");
		b = sc.nextInt();
		sub = a - b;
	}

	public void mul() {
		System.out.println("Enter First No :");
		a = sc.nextInt();

		System.out.println("Enter Second No :");
		b = sc.nextInt();
		mul = a * b;
	}

	public void div() {
		System.out.println("Enter First No :");
		a = sc.nextInt();

		System.out.println("Enter Second No :");
		b = sc.nextInt();
		div = a / b;
	}

	public void display() {
		System.out.println("The additon is :" + sum);
		System.out.println("The Subtraction :" + sub);
		System.out.println("The Multiplication :" + mul);
		System.out.println("The Division :" + div);

	}

	public static void main(String[] args) {
		Day4_9 d = new Day4_9();
		d.sub();
		d.sum();
		d.mul();
		d.div();
		d.display();
	}
}