package Day6;

import java.util.Scanner;

public class Day6_7_class implements Day6_7_Interface {
	int mar;
	int hin;
	int eng;
	int math;
	int sum;
	int avg;
	Scanner sc = new Scanner(System.in);

	@Override
	public void accept() {
		System.out.println("Enter the Marathi Subject Marks :");
		mar = sc.nextInt();
		System.out.println("Enter the hindi subject marks :");
		hin = sc.nextInt();
		System.out.println("Enter the eng subject marks  :");
		eng = sc.nextInt();
		System.out.println("Enter the maths subject marks :");
		math = sc.nextInt();
	}

	@Override
	public void print() {
		sum = mar + math + eng + hin;
		System.out.println("The sum of the all subjects is :" + sum);
		avg = sum / 4;
		System.out.println("The average of the marks is :" + avg);

	}

	public static void main(String[] args) {
		Day6_7_class d = new Day6_7_class();
		d.accept();
		System.out.println("-----------------------------------------");
		d.print();
	}

}
