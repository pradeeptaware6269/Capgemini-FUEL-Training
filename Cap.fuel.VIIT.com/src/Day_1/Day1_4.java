package Day_1;

import java.util.Scanner;

public class Day1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num1 Value :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Num2 value :");
		int num2 = sc.nextInt();
		System.out.println("The Values of Num1 and Num2 Before the swapping ");
		System.out.println("Value of Num1 :" + num1);
		System.out.println("Value of Num2 :" + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("The Values of Num1 and Num2 After the swapping ");
		System.out.println("Value of Num1 :" + num1);
		System.out.println("Value of Num2 :" + num2);

	}

}
