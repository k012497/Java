package chapter16.thread;

import java.awt.Toolkit;

/*
 * Runnable 인터페이스 구현을 통한 스레드 생성 
 */
public class MyThreadTest3 {

	public static void main(String[] args) {
		Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
		// 1. Thread에 입력해야 한다.
		// Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2); //runnable엔 start()가 없으므로, 매개변수로 전달해줘야 함 
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
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
