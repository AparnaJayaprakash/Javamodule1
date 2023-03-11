package multithreading;

import java.util.Scanner;

public class MyRunnable implements Runnable { // this class is providing space of run(), it is not a thread since thread
												// is not extended here instead implement is used which acts as
												// surrogate.

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Enter your input");
			int a = new Scanner(System.in).nextInt();
			System.out.println("Got the input proceeding");
			
			System.out.println(Thread.currentThread().getName() + "=" + i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
