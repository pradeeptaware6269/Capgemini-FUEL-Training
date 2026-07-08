package Day_3;

import java.util.Scanner;

public class Day3_8_matrix_mul {
	public static void main(String[] args) {
		int row, col, row1, col1, i = 0, j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of rows :");
		row = sc.nextInt();

		System.out.println("Enter the values of cols :");
		col = sc.nextInt();

		int matrix[][] = new int[row][col];

		for (i = 0; i < (row); i++) {
			for (j = 0; j < col; j++) {
				System.out.println("Enter the Value of " + i + " and " + j + "  position");
				matrix[i][j] = sc.nextInt();

			}

		}
		System.out.println("Enter the values of rows :");
		row1 = sc.nextInt();

		System.out.println("Enter the values of cols :");
		col1 = sc.nextInt();

		int matrix1[][] = new int[row1][col1];

		for (i = 0; i < (row1); i++) {
			for (j = 0; j < col1; j++) {
				System.out.println("Enter the Value of " + i + " and " + j + "  position");
				matrix1[i][j] = sc.nextInt();

			}

		}
		System.out.println("Here we are printing the array :");

		for (i = 0; i < (row); i++) {
			System.out.print(" |  ");
			for (j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "  ");

			}
			System.out.print(" | ");
			System.out.println();
		}
		System.out.println("Here we are printing the array :");

		for (i = 0; i < (row1); i++) {
			System.out.print(" |  ");
			for (j = 0; j < col1; j++) {
				System.out.print(matrix1[i][j] + "  ");

			}
			System.out.print(" | ");
			System.out.println();

		}
		System.out.println(" ----------------- ");
		int result[][] = new int[row][col];

		if (row == row1 && col == col1) {
			for (i = 0; i < (row1); i++) {
				System.out.print(" |  ");
				for (j = 0; j < col1; j++) {
					result[i][j] = matrix[i][j] * matrix1[i][j];
				}

			}
			System.out.println(" ----------------- ");

			for (i = 0; i < (row1); i++) {
				System.out.print(" |  ");
				for (j = 0; j < col1; j++) {
					System.out.print(result[i][j] + "  ");
				}
				System.out.println("  | ");
			}
		}
	}
}
