package Day_4;

import java.util.Scanner;

public class Day4_8_Class {
	int a, b;
	int sum;
	Scanner sc = new Scanner(System.in);

	public void sum() {
		System.out.println("Enter First No :");
		a = sc.nextInt();

		System.out.println("Enter Second No :");
		b = sc.nextInt();

		int sum = a + b;
		System.out.println("Here we are performing the Additon operation :");
		System.out.println("Addition is :" + sum);

	}public static void main(String[] args) {
		Day4_8_Class d=new Day4_8_Class();
		d.sum();
	}

}
