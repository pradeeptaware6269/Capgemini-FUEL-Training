package Day_1;

//  write he program sum of even number start from 2 to 50
public class Day1_15_loop {
	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 2; i <= 50; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of the Even numbers from 2 to 50 : "+sum);
	}

}
