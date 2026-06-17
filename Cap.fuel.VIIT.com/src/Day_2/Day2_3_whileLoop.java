package Day_2;

public class Day2_3_whileLoop {
	public static void main(String[] args) {
		int i = 2, sum = 0;
		while (i <= 50) {
			System.out.println(i);
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("Sum of the All even number :" + sum);
	}

}
