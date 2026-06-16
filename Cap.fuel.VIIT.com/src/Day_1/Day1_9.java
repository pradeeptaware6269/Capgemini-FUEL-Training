package Day_1;

import java.util.Scanner;

/* Problem Statement

Write a Java program that accepts a single alphabet character from the user and determines whether it is a
 **vowel** or a **consonant**. If the entered character is not an alphabet, display **"Invalid Input"**.
 
*/
public class Day1_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String here :");
		String str = sc.next();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("The current charcter the vowel :" + ch);
			} else {
				System.out.println("The curent charater is the consonent :" + ch);
			}
		}
	}

}
