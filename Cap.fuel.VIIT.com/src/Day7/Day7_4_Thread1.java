package Day7;

public class Day7_4_Thread1 extends Thread {
	public void run() {
		try {

			for (int i = 0; i <= 10; i++) {
				System.out.println("Good Morning");
			}

			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("End Of the Thread 1");
	}

}
