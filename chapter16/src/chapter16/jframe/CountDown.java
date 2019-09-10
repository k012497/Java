package chapter16.jframe;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame {
	private JLabel label;
	
	public CountDown() throws HeadlessException {
		super();
		setTitle("label test BY SOJIN");//창 이름
		setSize(300, 200);//창의 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창에 닫기 기능을 부여 
		this.label = new JLabel("start"); //라벨 객체 생성 
		this.label.setFont(new Font("Serif", Font.BOLD, 80));
		add(label); //창에 라벨 컴포넌트(객체)를 배치  
		Thread thread = new MyThread();
		thread.start();
		setVisible(true); //윈도우 창 활성화 -보여지도록 함. 
	}

	//member class
	public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		//반복문 실행 - 1~10까지 출력하는 라벨 객체 
		for(int i = 1 ; i <= 10 ; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			//System.out.println(i); //화면 객체에 출력 
			label.setText("  " + i);
			//label.setText(String.ValueOf(i);
			//label.setText(new String("1"));
		}
	}
	
	}//end of inner class

}
