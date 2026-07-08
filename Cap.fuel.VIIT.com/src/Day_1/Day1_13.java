package Day_1;

import java.util.Scanner;

public class Day1_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		
		switch (num%2) {
		case 0 :
			System.out.println("Given number is Even Number ");
			break;
		case 1 :
			System.out.println("Given number is ODD number  ");
			break;
		default:
			System.out.println("Invalide ok!!!");
		}
	}

}
