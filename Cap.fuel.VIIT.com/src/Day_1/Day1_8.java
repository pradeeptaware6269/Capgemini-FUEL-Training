package Day_1;

import java.util.Scanner;

/*
 * 
 * Write a Java program that simulates a traffic signal system.

The program should ask the user to enter a character representing a traffic signal color:

Press 'R' to Stop
Press 'Y' to Get Ready
Press 'G' to Go

After receiving the input, the program should display the corresponding action.
 If the user enters any character other than R, Y, or G, display an appropriate 
 error message 
 indicating that the input is invalid.
 
 */
public class Day1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter you choice :");
		ch = sc.next().charAt(0);

		if (ch == 'r' || ch == 'R') {
			System.out.println("YOU CAN STOP ");

		} else if (ch == 'y' || ch == 'Y') {
			System.out.println("Get Ready");
		} else if (ch == 'g' || ch == 'G') {
			System.out.println("You can GOO !!");
		} else {
			System.out.println("Invalide ");
		}
	}

}
