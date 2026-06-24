package Day7;

public class Day7_5_Thread3 extends Thread {
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("The Normal Excecution is :" + i);
		}

		System.out.println("The Thread 3 Execution is Done ");

	}

}