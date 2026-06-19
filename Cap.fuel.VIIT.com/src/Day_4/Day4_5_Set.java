package Day_4;

import java.util.HashSet;
import java.util.Iterator;

public class Day4_5_Set {
	public static void main(String[] args) {
		HashSet<String> st = new HashSet<String>();

		st.add("ravi");
		st.add("ram");
		st.add("ajay");
		st.add("ravi");

		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

	}

}
