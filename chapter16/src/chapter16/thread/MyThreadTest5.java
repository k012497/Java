package chapter16.thread;

import java.awt.Toolkit;
/*
 * Runnable 인터페이스 구현을 통한 스레드 생성 
 * anonymous object
 */
public class MyThreadTest5 {

	public static void main(String[] args) throws InterruptedException {
		// 1. 숫자를 찍어주는 스레드
		Thread t1 = new MyThread();
		//2. 소리를 내는 스레드
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
	});
		
		t1.start();
		t2.start();
	}

}
