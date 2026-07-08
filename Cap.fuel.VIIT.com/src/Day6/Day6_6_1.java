package Day6;

public class Day6_6_1 implements Day6_6 {
	int sum;
	int avg;

	@Override
	public void print(int a, int b, int c) {
		sum = a + b + c;
		avg = sum / 3;
		System.out.println("The sum of the 3 numbers is :" + sum);
		System.out.println("The average of the 3 numbers is :" + avg);

	}

	public static void main(String[] args) {
		Day6_6_1 d = new Day6_6_1();
		d.print(100, 200, 200);
	}

}
