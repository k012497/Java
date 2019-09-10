package chapter16.thread;

import java.awt.Toolkit;
/*
 * add yield()
 */
public class MyThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		// 1. 숫자를 찍어주는 스레드
		Thread t1 = new MyThread();
		//2. 소리를 내는 스레드
		Thread t2 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				if(i == 2 || i == 3) {
					Thread.yield();
				} else {
					toolkit.beep();
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
