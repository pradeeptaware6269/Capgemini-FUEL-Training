package Day5;

public class Day5_3 {
	public void show(int a, float b) {
		System.out.println("Hello world");
	}

	public void show(float a, int b) {
		System.out.println("good Morning");
	}

	public static void main(String[] args) {
		Day5_3 d = new Day5_3();
		d.show(3f, 4);
	}

}
