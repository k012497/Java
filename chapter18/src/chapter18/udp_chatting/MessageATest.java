package chapter18.udp_chatting;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessageATest {
	private JTextField textField;
	private JTextArea textArea;
	InetAddress address = null;
	DatagramSocket socket;
	DatagramPacket packet;

	final int myPort = 5000;
	final int otherPort = 6000;

	public MessageATest() throws UnknownHostException, SocketException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("192.168.112.23");
		socket = new DatagramSocket(myPort);
	}

	public void process() {
		try {
		while(true) {
			byte[] buf = new byte[256];
			new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				textArea.append("RECEIVE " + new String(buf) + "\n");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	class MyFrame extends JFrame implements ActionListener { // 구현해야 할 게많아서 함수로 만드는 게 나아서 익명객체 안 씀
		public MyFrame() throws HeadlessException{
			super("Message A");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			textField = new JTextField(30);
			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);
			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet =  null;
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			textArea.append(s);
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}// end of actionPerformed 

	}

	public static void main(String[] args) {
		MessageATest mt;
		try {
			mt = new MessageATest();
			mt.process();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

}
