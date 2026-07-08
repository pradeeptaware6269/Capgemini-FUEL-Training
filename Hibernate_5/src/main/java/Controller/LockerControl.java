package Controller;

import java.util.Scanner;

import Model.Locker;

public class LockerControl {

	public Locker getLockerControl() {

		Scanner sc = new Scanner(System.in);

		Locker l = new Locker();

		System.out.println("Enter Locker Id :");
		l.setLid(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter Locker Location :");
		l.setLocation(sc.nextLine());

		return l;
	}
}