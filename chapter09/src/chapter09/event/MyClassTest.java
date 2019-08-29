package chapter09.event;

import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MyClassTest {

	public static void main(String[] args) throws InterruptedException {
		ActionListener actionListener = new MyClass();
		
		//타이머 등록 - 시간 타이머로 이벤트를 자동 발생시켜보자. 
		Timer t = new Timer(1000, actionListener);
		t.start();
		for (int i = 0; i < args.length; i++) {
			Thread.sleep(1000);
		}
		
		
	}

}
