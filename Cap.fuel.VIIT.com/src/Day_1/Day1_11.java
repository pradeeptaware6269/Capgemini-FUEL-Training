package Day_1;

import java.util.Scanner;

public class Day1_11 {
	public static void main(String[] args) {
		float a, b, sum, sub, mul;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = sc.nextFloat();
		System.out.println("Enter the second number : ");
		b = sc.nextFloat();
		System.out.println("Enter  '+' for the addition ");
		System.out.println("Enter  '-' for the subtraction ");
		System.out.println("Enter  '*' for the multiplication ");

		System.out.println("Enter your choice :");
		char ch = sc.next().charAt(0);

		if (ch == '+') {
			sum = a + b;
			System.out.println("The addition of the 2 number is :" + sum);
		} else if (ch == '-') {
			sub = a - b;
			System.out.println("The subtraction of the numbers is :" + sub);

		} else if (ch == '*') {
			mul = a * b;
			System.out.println("The multiplication of the 2 number is :" + mul);
		} else {
			System.out.println("---------------- Invalide ------------ EXIT");
		}
	}

}
