package Day7;

public class Day7_5_Thread1 extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println("The Even Number is :" + i);
				}
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The Thread 1 Execution is Done ");

	}

}
