package chapter16.thread;

import java.awt.Toolkit;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("t2 : "+Thread.currentThread().getName());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
