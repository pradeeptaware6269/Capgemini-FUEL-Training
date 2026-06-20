package Assignment;

import java.util.Scanner;

//5. Find the largest element in a 2Darray.
public class Task5 {

	// Create a 3×3 array, take input fromthe user, and display thematrix.

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
		int max = arr[0][0];

		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");

				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println(" |");
			System.out.println();

		}
		System.out.println("The MAximum Value od the Array is the :" + max);

	}
}