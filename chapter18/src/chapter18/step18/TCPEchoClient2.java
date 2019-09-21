package chapter18.step18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.1.102", 3333);
		BufferedReader br = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		
		//PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
		PrintStream ps = new PrintStream(bos);
		
		Scanner s = new Scanner(System.in);
		while(true) {
			ps.println(s.nextLine());
			ps.flush(); 

		    System.out.println(br.readLine()); 

		}
		

		
	}
}
