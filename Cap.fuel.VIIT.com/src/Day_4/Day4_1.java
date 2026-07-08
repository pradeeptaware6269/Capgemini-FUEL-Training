package Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Day4_1 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);

		System.out.println(ll);
		ArrayList<Integer> li = new ArrayList<>();

		li.add(56);
		li.add(65);
		li.add(562);
		li.add(651);
		li.add(596);

		System.out.println(li);

		System.out.println("Here we are mergeing Both one ");
		li.addAll(ll);
		System.out.println(li);

		System.out.println("Here we can Sort it :");
		Collections.sort(li);
		System.out.print(li);

	}

}
