package Day7;

public class Day7_5_1_Runner {

	public static void main(String[] args) throws InterruptedException {
		Day7_5_Thread1 t1 = new Day7_5_Thread1();

		Day7_5_Thread2 t2 = new Day7_5_Thread2();

		Day7_5_Thread3 t3 = new Day7_5_Thread3();

		t1.start();
		t1.join();

		t2.start();
		t2.join();

		t3.start();
		t3.join();

	}

}
