package Day_4;

import java.util.Iterator;
import java.util.Stack;

public class Day4_4_stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Pradeep");
		stack.push("Taware");
		stack.push("Ram");
		stack.push("Karan");

		stack.pop();

		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
