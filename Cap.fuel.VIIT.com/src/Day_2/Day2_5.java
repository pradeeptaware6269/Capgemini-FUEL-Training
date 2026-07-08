package Day_2;

import java.util.Scanner;

public class Day2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp, num, digit, rev = 0;

		System.out.println("Enter the Number :");
		num = sc.nextInt();
		temp = num;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (temp == rev) {
			System.out.println("Given Number is Palidrome Number " + rev);
		} else {
			System.out.println("Given Number is Not palindrome " + rev);
		}
	}
}
