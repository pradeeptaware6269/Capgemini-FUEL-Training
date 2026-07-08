package Day_3;

import java.util.Scanner;

public class Day3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many element  Do you want Here :");
		int n = sc.nextInt();
		int arr[] = new int[n + 1];

		System.out.println("Enter the total Array Elements Here Which is :" + n);

		for (int i = 0; i <= n - 1; i++) {

			arr[i] = sc.nextInt();
		}

		int min = arr[0];

		for (int i = 1; i <  n; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("Mininum of tha Arrays is :" + min);

		int max = arr[0];

		for (int i = 1; i < n; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("MAXIMUM of tha Arrays is :" + max);

	}

}
