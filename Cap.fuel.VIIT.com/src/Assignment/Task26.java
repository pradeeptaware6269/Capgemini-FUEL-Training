package Assignment;

import java.util.Scanner;

//26. Check whether twomatrices are equal.
public class Task26 {
	public static void main(String[] args) {
		int row, col, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Row Limit :");
		row = sc.nextInt();

		System.out.println("Enter the Col Limit :");
		col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the Array1 Elements :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int arr2[][] = new int[row][col];
		System.out.println("Enter the Array2 Elements :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		System.out.println("The Both Array is created successfully.");

		boolean flag = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == arr2[i][j]) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}

		}

		if (flag == true) {
			System.out.println("Given Arrays are Equal ");
		} else {
			System.out.println("Not equal");
		}
	}
}
