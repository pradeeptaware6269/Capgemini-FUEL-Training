package Day_3;

import java.util.Scanner;

public class Day3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First String Here :");
		String str1 = sc.next();

		System.out.println("Enter the Second String Here :");
		String str2 = sc.next();

		System.out.println("Here We are Checking Equal or Not  :" + str1.equals(str2));

		int count = str1.compareTo(str2);

		if (count >= 1) {
			System.out.println("The Given String No 1 Is Larger :" + str1);

		} else if (count == 0) {
			System.out.println("Both are the Equal");

		} else {
			System.out.println("The given String no2 is Larger :" + str2);
		}
	}
}
