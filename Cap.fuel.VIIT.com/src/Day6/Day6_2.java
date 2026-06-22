package Day6;

public class Day6_2 {
	{
		System.out.println("i am a block");
	}
	static {
		System.out.println("i am a static block");
	}

	static void show() {
		System.out.println("i am a static method");
	}

	void show1() {
		System.out.println("i am a normal method");
	}

	public static void main(String[] args) {
		System.out.println("good");
		Day6_2 d = new Day6_2();
		d.show();
		d.show1();

	}
}
