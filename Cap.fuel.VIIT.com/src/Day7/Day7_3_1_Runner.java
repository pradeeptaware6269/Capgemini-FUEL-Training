package Day7;

public class Day7_3_1_Runner {
	public static void main(String[] args) {
		Day7_3_Thread1 t1 = new Day7_3_Thread1();
		Day7_3_Thread2 t2 = new Day7_3_Thread2();
		Day7_3_Thread3 t3 = new Day7_3_Thread3();
		t1.setPriority(1);
		t2.setPriority(7);
		t3.setPriority(10);

		t1.start();
		t2.start();
		t3.start();
	}

}
