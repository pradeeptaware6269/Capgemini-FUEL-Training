package Assignment;

import java.util.Scanner;

//14. Find the smallest element in each column of a 2Darray.
public class Task14 {

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
		System.out.println("The array is Creted successfully ");
		int i = 0, j = 0;
		int count = 0;
		int min = arr[i][j];
		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				min = arr[i][j];
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
				count++;
			}
			System.out.println("The MAX element of the Row " + (i + 1) + " : " + min);

		}

	}

}
