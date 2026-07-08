package Assignment;

import java.util.Scanner;

//27. Swap the first row with the last row.
public class Task27 {

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
		// for swapping
		for (j = 0; j < col; j++) {
			int temp = arr[0][j];
			arr[0][j] = arr[row - 1][j];
			arr[row - 1][j] = temp;
		}

		System.out.println("After the swapping the fisrt and last row we can simply swap it :");
		System.out.println("Now we can print Array ok !! ");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}
}
