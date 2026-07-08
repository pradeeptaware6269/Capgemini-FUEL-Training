package Day5;


public class Day5_4Runner extends Day5_4 {
	public void display() {
		int area = a + b;
		System.out.println("The Area of the reactangle is :" + area);
	}

	public static void main(String[] args) {
		Day5_4Runner a = new Day5_4Runner();
		a.input();
		a.display();
	}

}
