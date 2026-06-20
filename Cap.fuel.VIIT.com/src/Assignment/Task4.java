//4. Count the total number of even and odd elements in a 2Darray.
package Assignment;
//3. Find the sum of all elements in a 3×3 array.

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int row, col;
		int even_count = 0, odd_count = 0;

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

		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");
				if (arr[i][j] % 2 == 0) {
					even_count++;
				} else {
					odd_count++;
				}
			}
			System.out.println(" |");
			System.out.println();
		}

		System.out.println("The Even number Count is :" + even_count);
		System.out.println("The Odd Number Count is :" + odd_count);

	}
}
