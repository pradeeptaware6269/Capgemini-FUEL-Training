package Day_3;

import java.util.Scanner;

public class Day3_7 {
	public static void main(String[] args) {
		int row, col, i = 0, j = 0;
		Scanner sc = new Scanner(System.in);

		// 1
		System.out.println("Enter the values of rows :");
		row = sc.nextInt();

		// 2
		System.out.println("Enter the values of cols :");
		col = sc.nextInt();

		// 3
		int matrix[][] = new int[row][col];

		// 4

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				System.out.println("Enter the Value of " + i + " and " + j + "  position");
				matrix[i][j] = sc.nextInt();

			}

		}

		// 5
		System.out.println("Here we are printing the array :");

		for (i = 0; i < row; i++) {
			System.out.print(" |  ");
			for (j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "  ");

			}
			System.out.print(" | ");
			System.out.println();
		}
	}
}
