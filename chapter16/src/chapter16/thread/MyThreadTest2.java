package chapter16.thread;

import java.awt.Toolkit;

/*
 * 스레드 생성 방법 2
 */
public class MyThreadTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main : " + Thread.currentThread().getName());
		// 1. 숫자를 찍어주는 스레드
		Thread t1 = new MyThread() {
			@Override
			public void run() {
				System.out.println("t1 : " + Thread.currentThread().getName());
				for (int i = 1; i <= 5; i++) {
					System.out.println(i + " ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}; //임시 객체 
		
		// 2. 소리를 내는 스레드
		Thread t2 = new MyThread2();

		t1.start(); // run()이나 start()나 똑같음 - 차이점
		t2.start(); // 둘 다 run()으로하면 동시에 안 됨 why ?
	}
}
