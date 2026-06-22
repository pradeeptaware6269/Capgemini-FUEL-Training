package Day6;

import java.util.Scanner;

public class Day6_1 {

	int eid;
	int age;
	static String add = "Baramati";
	String desg;

	public Day6_1(int eid, int age, String desg) {
		super();
		this.eid = eid;
		this.age = age;
		this.desg = desg;
	}

	void display() {
		System.out.println("The Id of the Employee is :" + eid);
		System.out.println("The Age of the Emloye is :" + age);
		System.out.println("The Desiganation od the employee is :" + desg);
		System.out.println("The Address of the Company is :" + Day6_1.add);
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {

		Day6_1 d = new Day6_1(100, 20, "Pune");
		d.display();

		Day6_1 d1 = new Day6_1(10, 30, "satara");
		d1.display();
		Day6_1 d2 = new Day6_1(200, 29, "Vai");
		d2.display();

		Day6_1 d3 = new Day6_1(180, 31, "Kakan");
		d3.display();
		Day6_1 d4 = new Day6_1(160, 22, "Pune");
		d4.display();

		Day6_1 d5 = new Day6_1(121, 32, "Patas");
		d5.display();
	}

}
