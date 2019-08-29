package chapter09.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count = 0;
	
	// 이벤트가 발생하면 불러지는 콜백 함수 
	// 매개변수는 이벤트가 발생할 때, 모든 정보를 객체로 만들어서 ActionEvent e에 전달됨.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 발생 시 해야할 일 . 
		System.out.println((count++)+"beep");
	}

}
