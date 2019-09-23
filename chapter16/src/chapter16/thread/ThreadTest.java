package chapter16.thread;

import java.awt.Toolkit;

/*
 * 5 ways to make thread
 */
public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new MyThread(); //Thread를 상속한 객체 
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("thread 1");
				super.run();
			}
			
		};
		
		Thread t3 = new MyThread(); //Runnable을 구현한 객체 
		
		Thread t4 = new Thread(new Runnable() { //Runnable은 Thread의 자식이 아니니 인자로 전달 
			@Override
			public void run() {
				System.out.println("thread 4");
			}
			
		});
		
		Runnable r = ()-> {
				System.out.println("thread 5 by Lambda");
			
		};
		Thread t5 = new Thread(r);
		
		Thread t6 = new Thread(() -> {
				System.out.println("last thread");
		}); // 이것도 Runnable 인터페이스랑 관련 ?
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}
}
