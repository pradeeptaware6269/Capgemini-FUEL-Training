package Day7;

public class Day7_2 extends Thread {
	@SuppressWarnings("deprecation")
	public void run() {
		System.out.println("The id of the thread :" + Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		Day7_2 d = new Day7_2();
		d.start();
		System.out.println(d.hashCode());

		Day7_2 d2 = new Day7_2();
		d2.start();
	}

}
