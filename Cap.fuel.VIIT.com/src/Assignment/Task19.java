package Assignment;

import java.util.Scanner;

// 19. Copy one  2D array into another using nested loops.
public class Task19 {

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
		int dummy[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				dummy[i][j] = arr[i][j];
			}

		}

		System.out.println("Here we can printing the Dummy Array whixh can contains the copy elements :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(dummy[i][j] + " ");
			}
			System.out.println();
		}

	}

}
