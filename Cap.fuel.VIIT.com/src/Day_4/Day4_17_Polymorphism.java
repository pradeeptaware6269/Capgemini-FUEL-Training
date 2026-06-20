package Day_4;

public class Day4_17_Polymorphism {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("he are simply check the method overloading concept ");

		// for the integer
		Day4_17_Polymorphism p = new Day4_17_Polymorphism();
		System.out.println(p.add(22, 21));

		// for the float
		Day4_17_Polymorphism p1 = new Day4_17_Polymorphism();
		System.out.println(p1.add(23.1, 23.10));

	}

}
