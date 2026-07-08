package Day_4;

import java.util.Scanner;

public class Day4_15 {

	// here we need fond the perimeter the rectangle
	// And valume of cylinder

	Scanner sc = new Scanner(System.in);

	public void p_Rectangle() {
		System.out.println("Enter the Value Length :");
		int l = sc.nextInt();

		System.out.println("Emter the Value of Breadth :");
		int b = sc.nextInt();

		int result = 2 * (l + b);
		System.out.println("The Area of the Rerimeter of the Rectangle :" + result);
	}

	public void v_clinder() {
		System.out.println("Enter the Value Radius :");
		int r = sc.nextInt();

		System.out.println("Emter the Value of Heigth :");
		int h = sc.nextInt();

		double result = 3.14 * r * r * h;
		System.out.println("The Area of the Volume of the Cylinder :" + result);
	}

	public static void main(String[] args) {

		Day4_15 d = new Day4_15();
		d.p_Rectangle();
		d.v_clinder();

	}

}