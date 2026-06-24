package Day7;

public class Day7_4_1_Runner {
	public static void main(String[] args) {
		Day7_4_Thread1 t1 = new Day7_4_Thread1();

		Day7_4_Thread2 t2 = new Day7_4_Thread2();

		Day7_4_Thread3 t3 = new Day7_4_Thread3();

		t1.start();
		t2.start();
		t3.start();

	}

}
