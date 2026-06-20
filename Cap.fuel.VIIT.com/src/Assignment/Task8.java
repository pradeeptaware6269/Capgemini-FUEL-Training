package Assignment;

import java.util.Scanner;

//8. Print only the odd numbers from a  2Darray.
public class Task8 {
	public static void main(String[] args) {
		int row, col;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The arraya is Creted successfully ");
		System.out.println("Now we can printing the Odd Numbers Which may present in the Array ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] % 2 != 0) {
					System.out.print(arr[i][j] + "  ");
				}
			}
		}

	}

}
