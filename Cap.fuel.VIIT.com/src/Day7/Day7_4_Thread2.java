package Day7;

public class Day7_4_Thread2 extends Thread {
	public void run() {
		try {

			for (int i = 0; i <= 20; i++) {

				if (i % 2 == 0) {
					System.out.println("Even Number is :" + i);
				}
			}

			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("End Of the Thread 2");
	}

}