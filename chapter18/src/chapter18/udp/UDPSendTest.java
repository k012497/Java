package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest {

	public static void main(String[] args) {
		// 1. 데이터그램 소켓을 만든다.
		DatagramSocket dSocket = null;
		InetAddress address = null;

		try {
			dSocket = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		// 2. 보낼 데이터를 바이트 배열로 만들어 놓는다. 
		String data = new String("UDP 테스트");
		byte[] buf = data.getBytes();
		
		try {
			// 3. 보내고자 하는 주소를 설정한다.
			address = InetAddress.getByName("192.168.1.102");
			// 4. 패킷을 만든다.
			DatagramPacket dp = new DatagramPacket(buf, buf.length, address, 5000);
			dSocket.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			dSocket.close();
		}
		
	}

}
