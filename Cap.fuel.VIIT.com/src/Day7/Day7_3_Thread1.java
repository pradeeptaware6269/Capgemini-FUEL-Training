package Day7;

public class Day7_3_Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Natural Numbers :" + i);
		}
		System.out.println("End of the Thread 1 Execution ");
		System.out.println("The Id of the Thread 1:" + Thread.currentThread().getId());
	}

}
