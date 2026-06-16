package Day_1;

import java.util.Scanner;

public class Day1_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum,sub,mul;
		
		System.out.println("------ Here we are performing the Addition  | Subtraction | Multiplication in a single program ------  ");
		System.out.println("Enter the Values of A :");
		a=sc.nextInt();
		
		System.out.println("Enter the Values of B :");
		b=sc.nextInt();
		
		System.out.println("Enter the Values of C :");
		c=sc.nextInt();
		
		sum=a+b+c;
		System.out.println("The Additon of the three number is :"+sum);
		
		
		sub=a-b-c;
		System.out.println("The Substraction of the three number is :"+sub);
		
		mul=a*b*c;
		System.out.println("The Multiplication  of the three number is :"+mul);
		
		
		
		
	}

}
