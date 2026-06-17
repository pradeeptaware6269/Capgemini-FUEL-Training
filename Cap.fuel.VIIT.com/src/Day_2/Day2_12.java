package Day_2;

import java.util.Scanner;

public class Day2_12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
