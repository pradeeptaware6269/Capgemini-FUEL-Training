package Assignment;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int row = sc.nextInt();

		System.out.println("Enter number of columns:");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter matrix elements:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		boolean isIden = true;

		if (row != col) {
			isIden = false;
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {

					if (i == j && arr[i][j] != 1) {
						isIden = false;
					}

					if (i != j && arr[i][j] != 0) {
						isIden = false;
					}
				}
			}
		}

		if (isIden) {
			System.out.println("this is the Identity Matrix");
		} else {
			System.out.println(" this is Not an Identity Matrix");
		}

		sc.close();
	}
}