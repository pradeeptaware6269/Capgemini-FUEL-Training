package Assignment;

import java.util.Scanner;

// 30. Develop a Student Marks Management System using a 2Darray.
public class Task30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Subject of the students :");
		int sub = sc.nextInt();

		System.out.println("Enter the total number od the Students :");
		int stu = sc.nextInt();
		int marks[][] = new int[sub][stu];
		for (int i = 0; i < sub; i++) {
			for (int j = 0; j < stu; j++) {
				marks[i][j] = sc.nextInt();

			}
		}
		System.out.println("here array is created :");

		for (int i = 0; i < sub; i++) {
			System.out.println("----------------------------------------");
			System.out.println("Student " + (i + 1) + " Marks : ");

			for (int j = 0; j < stu; j++) {
				System.out.print("Subject " + (j + 1) + " marks is :");
				System.out.println(marks[i][j] + " ");

			}
			System.out.println("");
		}

		System.out.println("so here we can simply find the Average of the students :");

		for (int i = 0; i < sub; i++) {
			int avg = 0;
			int sum = 0;

			for (int j = 0; j < stu; j++) {
				sum = sum + marks[i][j];

			}
			avg = sum / sub;
			System.out.println("The average marks of  the Student " + (i + 1) + " is :" + avg);
		}

	}

}
