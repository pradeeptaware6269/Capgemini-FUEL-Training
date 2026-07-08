package Day_3;

import java.util.Scanner;

public class Day3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element  Do you want Here :");
		int n = sc.nextInt();
		int arr[] = new int[n + 1];
		System.out.println("Enter the total Array Elements Here Which is :" + n);
		for (int i = 0; i <= n - 1; i++) {

			arr[i] = sc.nextInt();
		}

		int max = arr[0];

		for (int i = 1; i <= n - 1; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("MAXIMUm of tha Arrays is :" + max);

	}

}
