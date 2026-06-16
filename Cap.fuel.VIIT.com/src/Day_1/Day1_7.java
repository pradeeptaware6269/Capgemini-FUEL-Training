package Day_1;

// Conditional Statement 

// if - else statement

//  Write the program whether given number is Even or Odd 
import java.util.Scanner;

public class Day1_7 {
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Given Number Is EVEN number ");
		} else {
			System.out.println("Given Number Is ODD Number  ");
		}
	}

}
