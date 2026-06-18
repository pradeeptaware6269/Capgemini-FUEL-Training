package Day_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Day3_12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the how many element do you want : ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter the element Here :");

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			list.add(temp);

		}
		
		System.out.println("Here we are simply printing the Numbers :");
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
