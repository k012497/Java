package chapter18.game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientTest extends Thread{
	private JButton[][] buttons = new JButton[3][3];
	private char me, other;
	private JFrame frame;
	private JPanel panel;
	private JLabel message;
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;

	public ClientTest() {
		try {
			socket = new Socket("192.168.112.23", 9001);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		Font font = new Font("Dialog", Font.ITALIC, 50);
		
		message = new JLabel("message here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(message, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int ii = i;
				int jj = j;
				
				buttons[i][j] = new JButton(""); //9개 버튼에 공백 집어넣기 
				buttons[i][j].setFont(font);//폰트 지정 
				buttons[i][j].addActionListener(e -> {
						buttons[ii][jj].setText("" + me); //이미 메모리에 없는데 ii, jj를 어떻게 참조하냐. >> 그래서 final로. 
						pw.println("MOVE " + ii + " " + jj);
					}
				);
				panel.add(buttons[i][j]);
			}
			panel.repaint();
		}
	}// end of constructor

	@Override
	public void run() {
		String data = null;
		
		try {
			data = br.readLine();
			if(data.startsWith("START")) {
				me = data.charAt(6);
				other = (me == 'X') ? 'O': 'X';
				message.setText("GAME STARTS!");
				frame.setTitle("현재 경기자는 " + me);
			}
			
		while(true) {
			data = br.readLine();
			if(data.startsWith("OTHER")) {
				final int i = Integer.parseInt(data.substring(6, 7));
				final int j = Integer.parseInt(data.substring(8, 9));
		        buttons[i][j].setText("" + other);
	            message.setText("상대방이 두었습니다. ");
	            
			} else if(data.startsWith("PRINT")) {
				message.setText(data.substring(6));
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end of while
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				socket.close();//socket 제일 나중에 닫기 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ClientTest ct = new ClientTest();
		ct.start(); //////////////
	}

}
