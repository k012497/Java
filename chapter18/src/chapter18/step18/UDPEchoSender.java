package chapter18.step18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPEchoSender {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = null;//데이터그램 소켓
		InetAddress ia = null; //보내고자하는 주소 
		
		try {
			socket = new DatagramSocket(6000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	
		// 보낼 데이터 바이트 배열
		Scanner s = new Scanner(System.in);
		while(true) {			
			String data = s.nextLine();
			
			byte[] buf = data.getBytes();
			if(data.equals("quit")) break; // quit 입력 시 종료 
			
			ia = InetAddress.getByName("192.168.1.102");
			
			DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 5000);
			socket.send(dp);
			DatagramPacket dp2 = new DatagramPacket(buf, buf.length);
			socket.receive(dp2);
			System.out.println(new String(buf) + "..."); // 보낼 바이트배열이랑 받을 배열 달라야하나?
			
		}			

	}

}
