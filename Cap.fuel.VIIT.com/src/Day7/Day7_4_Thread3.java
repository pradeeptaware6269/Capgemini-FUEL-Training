package Day7;

public class Day7_4_Thread3 extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Good Afternoon");
			}

			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("End Of the Thread 3");
	}

}