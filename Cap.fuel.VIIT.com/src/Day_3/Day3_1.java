package Day_3;

import java.util.Scanner;

public class Day3_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many element  Do you want Here :");
		int n = sc.nextInt();

		int arr[] = new int[n + 1];

		int arr1[] = { 2, 22, 4, 5, 6 };

		System.out.println("Enter the total Array Elements Here Which is :" + n);

		for (int i = 0; i <= n - 1; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Element which you want to search Ok :");
		int search = sc.nextInt();

		for (int i = 0; i <= n - 1; i++) {

			if (arr[i] == search) {
				System.out.println("Here Given Element is found Ok !!! , for the iteration :" + i);
				System.out.println("Congratulation !!!!!!!");
				System.out.println();
				break;
			} else {
				System.out.println("here Element is not Found for the This Itaretion :" + i);
			}
			System.out.println("--------------------------------------");
		}

	}

}
