package chapter18.step18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.1.102", 3333);
		BufferedReader br = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		
		//PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
		PrintStream ps = new PrintStream(bos);
		
		Scanner s = new Scanner(System.in);
		while(true) {
			ps.println(s.nextLine());
			ps.flush(); // 엔터 두 번 쳐야 전송된다

		    System.out.println(br.readLine()); 
		    // 받아온 에코 출력하고 나서 개행 안 됨  >>한글만 ;;
		    // 수동으로 커서 옮겨서 23라인 진행해야 함 
		    
		    //서버는 계속 돌리고 클라이언트 종료하고 또 실행하면 에코 안 됨 . 
			
			//String output = br.readLine();
			//System.out.println(output);
			//d언제 보내는 거 받아와야하는지?
		}
		

		
	}
}
