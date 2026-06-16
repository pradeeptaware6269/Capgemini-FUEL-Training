package Day_1;

// Conditional Statement 
// if - else statement

// Statement : Check the person age is valid or not ...
import java.util.Scanner;

public class Day1_5 {
	public static void main(String[] args) {
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of the person :");
		age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are eligible for the Vote");
		} else {
			System.out.println("you cant ");
		}
	}

}
