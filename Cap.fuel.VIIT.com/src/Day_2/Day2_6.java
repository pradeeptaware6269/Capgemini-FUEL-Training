package Day_2;

import java.util.Scanner;

public class Day2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;

		System.out.println("Enter the String here :");
		String str = sc.next();
		int i = 0;
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			System.out.print(ch + " ");
		}
	}

}
