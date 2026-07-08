package Day_4;

import java.util.Scanner;

public class Day4_11 {
	int a, b, r;
	Scanner sc = new Scanner(System.in);

	public Day4_11() {
		System.out.println("This is our Default Constrctor ");
	}

	public void rect() {

		System.out.println("Enter thevalue of a :");
		a = sc.nextInt();

		System.out.println("Enter the value of b:");
		b = sc.nextInt();

		System.out.println("The Area of the Rectangle is :" + (a * b));
	}

	public void cir() {
		System.out.println("Enter thevlue of r :");
		int r = sc.nextInt();
		System.out.println("Area of the Cicrcle :" + (3.14 * r * r));
	}

	public static void main(String[] args) {
		Day4_11 d = new Day4_11();

		d.cir();
		System.out.println("--------------------------------");
		d.rect();

	}
}
