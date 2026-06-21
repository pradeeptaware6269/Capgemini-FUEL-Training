package Assignment;

import java.util.Scanner;

public class Task17 {

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

			for (int j = 0; j < col; j++) {
				if (arr[i][j] < 0) {
					arr[i][j] = 0;
				} else {
					continue;
				}
			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
