package Assignment;

import java.util.Scanner;

//27. Swap the first row with the last row.
public class Task27 {


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
		
		int max = arr[i][j];
		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				
				}
				
			}
			System.out.println("The MAX element of the Row " + (i + 1) + " : " + max);

		}

	}

}
