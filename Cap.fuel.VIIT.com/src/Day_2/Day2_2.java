package Day_2;

import java.util.Scanner;

public class Day2_2 {
	public static void main(String[] args) {
		int num, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many you want iterate the Loop : ");
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.println("Enter the number :");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("Ok Bye ");
				break;
			}
			sum = sum + num;

		}
		System.out.println("The Total Number Of the SUM is :" + sum);
	}

}
