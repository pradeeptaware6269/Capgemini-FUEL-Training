package Assignment;

import java.util.Scanner;

//29.Find the transpose and print it in reverse order.
public class Task29 {
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
		System.out.println("The Normal Matrix is :");
		for (i = 0; i < (row); i++) {
			System.out.print(" | ");
			for (j = 0; j < col; j++) {

				System.out.print(matrix[i][j] + " ");

			}
			System.out.print(" | ");
			System.out.println();

		}

		int trans[][] = new int[row + 1][col + 1];
		for (i = 0; i < (row); i++) {
			for (j = 0; j < col; j++) {

				trans[j][i] = matrix[i][j];

			}

		}
		System.out.println("The Trans Matrix is :");
		for (i = 0; i < (row); i++) {
			System.out.print(" | ");
			for (j = 0; j < col; j++) {

				System.out.print(trans[i][j] + " ");

			}
			System.out.print(" | ");
			System.out.println();

		}

		System.out.println("The Trans Matrix In reverse Order  :");
		for (i = row - 1; i >= 0; i--) {
			System.out.print(" | ");
			for (j = col - 1; j >= 0; j--) {

				System.out.print(trans[i][j] + " ");

			}
			System.out.print(" | ");
			System.out.println();

		}

	}
}
