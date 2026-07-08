package Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Day4_2 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);

		System.out.println(ll);
		ArrayList<String> li = new ArrayList<>();

		li.add("56");
		li.add("65");
		li.add("562");
		

		System.out.println(li);

		System.out.println("Here we are mergeing Both one ");
		
		li.addAll((ArrayList)li );
		System.out.println(li);

		System.out.println("Here we can Sort it :");
		Collections.sort(li);
		System.out.print(li);

	}

}
