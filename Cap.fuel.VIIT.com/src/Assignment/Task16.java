package Assignment;

import java.util.Scanner;

//16. Count the elements divisible by both 3 and 5.
public class Task16 {

	public static void main(String[] args) {
		int row, col, count = 0;

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
			int sum = 0;
			for (int j = 0; j < col; j++) {
				if (arr[i][j] % 2 == 0 || arr[i][j] % 5 == 0) {
					count++;
				} else {
					continue;
				}
			}
			System.out.println("The Total Number of Count is :" + count);

		}

	}

}
