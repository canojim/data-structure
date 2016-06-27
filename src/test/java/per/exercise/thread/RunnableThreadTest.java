package per.exercise.thread;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnableThreadTest implements Runnable {

	private int count = 0;
	
	@Override
	public void run() {
		System.out.println("RunnableThread starting.");
		while (count < 5) {
			try {
				System.out.println("count: " + count);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
	}
	
	@Test
	public void testRunnable() throws InterruptedException {
		//Prefer implement Runnable instead of inherit Thread class
		
		Thread t = new Thread(this);
		t.start();
		while (this.count < 5) {
			Thread.sleep(250);
		}
		Assert.assertTrue(true);
	}

	
}
