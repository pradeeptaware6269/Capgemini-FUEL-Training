package Day5;

public class Day5_5_c extends Day5_5_b

{
	public void display() {
		System.out.println("The area of the Rectangle :" + area);
		System.out.println("The volume of the cylinder :" + volume);
	}

	public static void main(String[] args) {
		Day5_5_c d = new Day5_5_c();
		d.input();
		d.area();
		d.display();
	}
}
