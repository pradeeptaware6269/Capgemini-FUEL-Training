package Day7;

public class Day7_5_Thread2 extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				if (i == 5) {
					stop();
				} else {
					System.out.println("The Natural Number is :" + i);
				}

			}

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The Thread 2 Execution is Done ");

	}

}
