package chapter18.step18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoReceiver {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(5000);
		
		
		while(true) {
			byte[] buf = new byte[256];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			socket.receive(dp);
			System.out.println("ECHO" + new String(buf));
			
			socket.send(dp); //에코 전송 
		}
			
	}

}
