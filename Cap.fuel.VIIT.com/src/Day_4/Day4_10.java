package Day_4;

import java.util.Scanner;

public class Day4_10 {

	int a, b, sum;

	public Day4_10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1 :");
		a = sc.nextInt();

		System.out.println("Enter the Number 2 :");
		b = sc.nextInt();
	}

	void sum() {
		sum = a + b;
		System.out.println("Sum Of the Numbers is :" + sum);
	}

	public static void main(String[] args) {
		Day4_10 d = new Day4_10();
		d.sum();
	}

}
