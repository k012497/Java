package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPReceiveTest {

	public static void main(String[] args) throws IOException {
		// 1. 데이터그램 소켓을 만든다.
		DatagramSocket dSocket = new DatagramSocket(5000);// send에서 5000으로 보냈으니까 

		// 2. 데이터를 받을 바이트 배열을 만들어 놓는다. 
		byte[] buf = new byte[256];
		
		// 3. 패킷을 마든다.
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		dSocket.receive(dp);
		System.out.println(new String(buf));


	}

}
