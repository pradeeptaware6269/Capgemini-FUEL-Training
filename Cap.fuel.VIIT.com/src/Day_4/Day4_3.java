package Day_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Day4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many Element do you want :");
		int n = sc.nextInt();
		ArrayList<Integer> li = new ArrayList<Integer>();
		System.out.println("Enetr the elements :");
		for (int i = 0; i < n; i++) {
			li.add(sc.nextInt());
		}

		System.out.println("Enter the which element do want delete :");
		int del = sc.nextInt();

		if (li.contains(del)) {
			li.remove(Integer.valueOf(del));

			System.out.println("The given number is deleted ok !!! " + del);
		} else {
			System.out.println("This element is not present in the List ok!! ");
		}

		System.out.println("After the Deletion Element in the list :");
		System.out.println(li);
	}

}
