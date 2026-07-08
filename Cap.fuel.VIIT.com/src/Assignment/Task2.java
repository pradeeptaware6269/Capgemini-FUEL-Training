package Assignment;

import java.util.Scanner;

public class Task2 {
	// 2. Print all elements of a 2D array using nested for loops.

	public static void main(String[] args) {

		int row, col;

		Scanner sc = new Scanner(System.in);
		System.out.println("here we can simply create the 3x3 matrix ");

		System.out.println("Enter the size of the Row :");
		row = sc.nextInt();

		System.out.println("Enter the size of the col :");
		col = sc.nextInt();
		int arr[][] = new int[row][col];

		System.out.println("Enter the value of the Array Element :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the elemne tfor position " + i + " " + j + " :");
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" |");
			System.out.println();
		}

	}
}
