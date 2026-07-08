package Day_2;

import java.util.Scanner;

public class Day2_14 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int a[] = { 5, 6, 4, 5, 4 };
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println("Entre the Number , which number do you want tomserach ok..... :");
		int s_No = sc.nextInt();
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == s_No) {
				count++;
			}

		}
		System.out.println("Here the number is " + s_No);
		System.out.println("And it may occures :" + count);
	}

}
