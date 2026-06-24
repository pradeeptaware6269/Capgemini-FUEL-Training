package Day7;

public class Day7_3_Thread3 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Numbers :" + i);
			} else {
				continue;
			}
		}
		System.out.println("End of the Thread 3 Execution ");
		System.out.println("The Id of the Thread 1:" + Thread.currentThread().getId());
	}

}
