package Assignment;

//13. Find the largest element in each row of a 2Darray.
import java.util.Scanner;

public class Task13 {

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
		int count = 0;
		for (i = 0; i < row; i++) {

			int max = arr[0][count];
			for (j = 0; j < col; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
				count++;
			}
			System.out.println("The MAX element of the Row " + (i + 1) + " : " + max);

		}

	}

}
