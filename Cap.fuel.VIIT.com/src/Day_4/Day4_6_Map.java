package Day_4;

import java.util.HashMap;
import java.util.Map;

public class Day4_6_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hsh = new HashMap<Integer, String>();

		hsh.put(1, "Mango");
		hsh.put(2, "Apple");
		hsh.put(3, "Banana");

		hsh.put(null, "grapes");

		hsh.put(3, "Dragon");
		for (Map.Entry m : hsh.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());

		}
	}

}
