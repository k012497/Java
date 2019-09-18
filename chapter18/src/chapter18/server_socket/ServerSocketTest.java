package chapter18.server_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class ServerSocketTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		while(true) {
			// Waiting until client accepts
			// if client accepts, make client Socket
			System.out.println("waiting client . . . ");
			Socket socket = ss.accept();
			
			InetAddress ia = socket.getInetAddress(); //소켓을 통해 상대방의 정보를 알아낼 수 있다. 
			System.out.println(ia.getHostAddress()+"님이 접속하셨습니다. ");
			
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine(); //대기 상태 
			System.out.println(data);
			
			PrintStream ps = new PrintStream(os);
			ps.println(new Date().toString());
			ps.close();
			break;
			
		}//end of while
		ss.close();
	}

}
