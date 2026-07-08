package Day_1;

// Conditional Statement 

// if - else statement

//  Write the program whether given number is positive or negative 
import java.util.Scanner;

public class Day1_6 {
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = sc.nextInt();

		if (num >  0) {
			System.out.println("Given Number Is Positive Number ");
		} else {
			System.out.println("Given Number Is Negative Number  ");
		}
	}

}
