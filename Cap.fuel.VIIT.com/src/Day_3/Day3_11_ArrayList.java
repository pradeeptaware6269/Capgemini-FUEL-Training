package Day_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Day3_11_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(12);
		lst.add(14);
		lst.add(17);
		lst.add(22);
		lst.add(32);
		lst.add(43);

		System.out.println("Here we are simply print the arrayList Elements :  ");

//		System.out.println(" using this techniques also ");
//		for e (Integer itr : lst) {
//			System.out.println(lst);
//		}

		System.out.println("Another Technique ");

		System.out.println(lst);

		System.out.println("Using the Ierator :");
		Iterator ite = lst.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
