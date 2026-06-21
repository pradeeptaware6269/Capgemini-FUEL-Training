package Assignment;

import java.util.Scanner;

//23. Find the sum of the main and secondary diagonal elements.
public class Task23 {

	public static void main(String[] args) {
		int row, col, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col Limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The array is created successfully.");

		if (row == col) {
			System.out.println("Secondary Diagonal Elements:");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i + j == row - 1) {
						System.out.print(arr[i][j] + " ");
						sum = arr[i][j] + sum;
					} else {
						System.out.print("_ ");
					}
				}
				System.out.println();
			}

		} else {
			System.out.println("Diagonal can be printed only for a square matrix.");
		}

		System.out.println("The Sum of the secondary diagonal Element is :" + sum);

		sc.close();
	}
}