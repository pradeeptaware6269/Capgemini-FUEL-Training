package Assignment;
//11. Find the sum of each row in a 2Darray.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int row, col;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];
		System.out.println("Enter the Array Elements  :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The arraya is Creted successfully ");

		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("The Sum of the Row is :" + sum);

		}

	}

}
