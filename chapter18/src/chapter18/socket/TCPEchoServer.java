package chapter18.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	public static void main(String[] args) throws IOException {

		System.out.println("SERVER STARTS");
		ServerSocket ss = new ServerSocket(3333);
		Socket socket = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader (socket.getInputStream()));

		//PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		OutputStream os = socket.getOutputStream();
		PrintStream ps = new PrintStream(os);
		
		while(true) {	
			String echo = br.readLine(); 
			ps.println(echo+". . .");
		}

	}

}
