package chapter16.thread;

import java.awt.Toolkit;
/*
 * 스레드 생성 방법 1
 */
public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// 1. 숫자를 찍어주는 스레드
		Thread t1 = new MyThread();
		//2. 소리를 내는 스레드
		Thread t2 = new MyThread2();
		
		t1.start(); // run()이나 start()나 똑같음
		t2.run(); //둘 다 run()으로하면 동시에 안 됨  why ?
	}

}
