package Day5;

import java.util.Scanner;

public class Day5_6 {

    int l, b, r;
    int area, peri, cir;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the length:");
        l = sc.nextInt();

        System.out.println("Enter the breadth:");
        b = sc.nextInt();

        System.out.println("Enter the radius:");
        r = sc.nextInt();
    }

    public class B extends Day5_6 {
        public void cal() {
            area = l * b;
            peri = 2 * (l + b);
            cir = (int) (2 * 3.14 * r);
        }
    }

    public class C extends B {
        public void display() {
            System.out.println("Area of Rectangle: " + area);
            System.out.println("Perimeter of Rectangle: " + peri);
            System.out.println("Circumference of Circle: " + cir);
        }
    }

    public static void main(String[] args) {

        Day5_6 outer = new Day5_6();

        C obj = outer.new C();

        obj.input();
        obj.cal();
        obj.display();
    }
}