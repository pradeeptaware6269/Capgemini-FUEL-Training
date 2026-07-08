package Assignment;

import java.util.Scanner;
// 10 .Calculate the average of all elements in a 2Darray.

public class Task10 {

	public static void main(String[] args) {
		int row, col;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		double sum = 0, avg = 0;
		System.out.println("The arraya is Creted successfully ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum = sum + arr[i][j];
			}

		}
		avg = sum / (row * col);
		System.out.println("The average of the all Array Elements is :" + avg);

	}

}
