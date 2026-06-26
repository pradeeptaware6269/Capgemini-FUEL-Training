package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Account;

public class AccountControl {
	public void getAccountData() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> l1 = new ArrayList<Account>();
		Account a = new Account();

		System.out.println("how many Account do want to create it :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Account ID " + i + " : ");
			a.setAid(sc.nextInt());

			System.out.println("Enter the Account Type " + i + " : ");
			a.setType(sc.next());

			System.out.println("Enter the Account location" + i + " : ");

		}

	}

}
