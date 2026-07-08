package Day6;

public class Day6_8_Runner extends Day6_8Class2 implements Day6_8_Interfase3 {

	int total = mar + math + sci + skill_marks;

	@Override
	public void disp() {
		System.out.println("the total marks is :" + total);

	}

	public static void main(String[] args) {
		Day6_8Class1 r = new Day6_8Class1();

		r.input();
		r.display();
		System.out.println("------------------------------------");

		Day6_8Class2 r2 = new Day6_8Class2();
		r2.input();
		r2.display();

		System.out.println("-------------------------------------");

		Day6_8_Runner r3 = new Day6_8_Runner();
		r3.disp();
	}

}
