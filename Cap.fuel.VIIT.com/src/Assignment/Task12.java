package Assignment;
//12. Find the sum of each col in a 2Darray.

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int row, col;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];
		if (row == col) {
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
					sum = sum + arr[j][i];
				}
				System.out.println("The Sum of the Col is :" + sum);

			}

		} else {
			System.out.println("Sorry we are moving towards because here we need to same limit of the ROW and COL ");
		}
	}

}
