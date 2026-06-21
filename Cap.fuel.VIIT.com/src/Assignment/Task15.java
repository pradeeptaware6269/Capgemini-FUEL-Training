package Assignment;

import java.util.Scanner;

// 15. Search for a given element in a 2Darray and display its row and column index.

public class Task15 {

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

		System.out.println("Enter the Element ,do you want to search :");
		int s_Ele = sc.nextInt();

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				if (arr[i][j] == s_Ele) {
					System.out.println("The Element is found Here postion is " + i + " " + j);
					break;
				}

				else {
					continue;
				}
			}
		}
	}
}
