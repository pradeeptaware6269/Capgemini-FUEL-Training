package Day6;

import java.util.Scanner;

public class Day6_5_1 extends Day6_5 {

	// abstract method override
	@Override
	void input1() {
		System.out.println("here are from the abstarct method");

		System.out.println("the salary is :" + sal);
		System.out.println("the add is :" + add);
		System.out.println("the name is :" + name);

	}

	public static void main(String[] args) {

		Day6_5_1 d = new Day6_5_1();

		d.print();

		d.input1();

	}
}