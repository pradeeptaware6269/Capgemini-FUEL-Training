package Day_1;

import java.util.Scanner;

public class Day1_16 {
	public static void main(String[] args) {
		int i, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here :");
		num = sc.nextInt();

		for (i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}
}
