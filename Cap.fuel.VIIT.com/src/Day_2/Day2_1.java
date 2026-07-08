package Day_2;

import java.util.Scanner;

public class Day2_1 {
	public static void main(String[] args) {
		String usrename = "pradeep123";
		int pass = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username Here :");
		String usrename1 = sc.next();
		System.out.println("Enter the Password Here :");
		int pass1 = sc.nextInt();

		if (usrename1.equals(usrename)) {
			if (pass1 == pass) {
				System.out.println("User login succesfully ");
			} else {
				System.out.println("User credentila are not matched Here ");
			}
		} else {
			System.out.println("Invaide Username entered");
		}

	}

}
