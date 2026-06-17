package Day_2;

import java.util.Scanner;

public class Day2_13 {
	public static void main(String[] args) {
		int i = 0, sum = 0, total;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7];
		System.out.println("Enter the & subject Marks of 100 ..... ");
		for (i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		avg = sum / 7;
		System.out.println("The average of the student marks is :" + avg);

	}

}
