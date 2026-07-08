package Assignment;

import java.util.Scanner;

//21. Print themain diagonal elements of a squarematrix.
public class Task21 {

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
		if (row == col) {
			System.out.println("Here we arae printing the array Diagnals Only :");
			for (int i = 0; i < row; i++) {

				for (int j = 0; j < col; j++) {
					if (i == j) {
						System.out.print(arr[i][j] + " ");
					} else {
						System.out.print("_ ");
					}

				}
				System.out.println();

			}

		} else {
			System.out.println("Here we can not able to print diagonal");
		}
	}

}
