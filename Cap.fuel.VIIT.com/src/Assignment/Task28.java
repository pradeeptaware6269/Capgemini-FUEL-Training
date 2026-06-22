package Assignment;

import java.util.Scanner;

//28. Swap the first column with the last column.

public class Task28 {

	public static void main(String[] args) {
		int row, col;
		int i = 0, j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];
		System.out.println("Enter the Array Elements  :");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The array is Creted successfully ");
		System.out.println("Now we can print the normal Array :");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// for swapping first column to last column
		for (i = 0; i < row; i++) {
			int temp = arr[i][0];
			arr[i][0] = arr[i][col - 1];
			arr[i][col - 1] = temp;
		}

		System.out.println("After the swapping the first col and last col we can simply swap it :");
		System.out.println("Now we can print Array ok !! ");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
