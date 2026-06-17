package Day_2;

import java.util.Scanner;

public class Day2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cal, num, power;
		System.out.println("Enter the number :");
		num = sc.nextInt();

		System.out.println("Enter the Power :");
		power = sc.nextInt();

		cal = (int) Math.pow(num, power);
		System.out.println(cal);
	}

}
