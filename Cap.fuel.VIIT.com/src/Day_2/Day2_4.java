package Day_2;

import java.util.Scanner;

public class Day2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enyte the Number :");
			int num = sc.nextInt();
			if (num >= 1 && num <= 50) {
				System.out.println("The Given Number Is accepted :" + num);
				System.out.println("EXIT ");
				break;
				
			} else {
				System.out.println("The Given Number is not accepted :  Please Enter the Valide NUmber ");
			}
		}
	}

}
