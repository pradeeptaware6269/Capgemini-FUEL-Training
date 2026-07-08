package Assignment;

import java.util.Scanner;
// 9. Count the positive, negative, and zero elements in a 2D array.

public class Task9 {

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
		int posi = 0, nega = 0, zro = 0;
		System.out.println("The arraya is Creted successfully ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] > 0) {
					posi++;
				} else if (arr[i][j] == 0) {
					zro++;
				} else {
					nega++;
				}
			}

		}
		System.out.println("The Total Positive Numbers is :" + posi);
		System.out.println("The Total Negative Number is :" + nega);
		System.out.println("The Total zero Numbers is :" + zro);

	}

}
