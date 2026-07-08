package Day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("here we are simly performing the Attay List :");

		while (true) {

			System.out.println("Enter the --- 1 --- for the TO insert the element into the Array List : ");
			System.out.println("Enter the --- 2 --- for the Remove element from the Array List        : ");
			System.out.println("Enter the --- 3 --- for the Display the Array List                    : ");
			System.out.println("EXIT : ");

			System.out.print("Enetr your choice Here :");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the element for inserting the ArrayList :");
				int num = sc.nextInt();

				if (lst.contains(num)) {
					System.out.println("Sorry that given number is Already Present :");
				} else {
					lst.add(num);
					System.out.println("The given Element is inserted Successfully :" + num);
				}
				break;

			case 2:

				System.out.println("Enter the Index for removing from the ArrayList :");
				int num1 = sc.nextInt();
				lst.remove(Integer.valueOf(num1));
				System.out.println("The Given Element is removed ");
				break;

			case 3:

				System.out.println("Here we can simply display the elemenyts :");
				Iterator itr = lst.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;

			case 4:
				System.out.println("-----------------   SYSTEM EXIT    ------------------ ");
				System.exit(0);

			default:
				System.out.println(" Something   Wents   Wrong ");

			}
		}
	}
}
