package Day7;

public class Day7_1 extends Thread {
	public void run() {
		System.out.println("Thread id running ");
	}

	public static void main(String[] args) {
		Day7_1 d = new Day7_1();
		d.start();
	}

}
