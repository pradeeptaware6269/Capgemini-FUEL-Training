package Day_3;

import java.util.Scanner;

public class Day3_5 {
	public static void main(String[] args) {
		System.out.println("Here we are performing the String concatenation ");
		Scanner sc = new Scanner(System.in);

		String s1 = new String("Java");
		String s2 = " JAVA";
		System.out.println("String no 1  :" + s1);
		System.out.println("String no 2  :" + s2);

		System.out.println("After performing the Concatenation operation :" + (s1 + s2));

		System.out.println(s1.concat(s2));

		byte num[] = { 65, 66, 67, 68 };
		String s3 = new String(num);
		System.out.println("Here we are converting the array to string :" + s3);

		String str1 = "pradeep";
		String str2 = "PRADEEP";

		// equals
		System.out.println(str1.equals(str2));

		// equalignoreCase
		System.out.println(str1.equalsIgnoreCase(str2));

		// trim()
		String str3 = "   Pradeep Taware   ";
		System.out.println(str3.trim());

		// startwith()
		String str4 = "Pradeep Taware Patil";
		System.out.println(str4.startsWith("Pra"));

		// endswith()

		System.out.println(str4.endsWith("il"));

	}

}
