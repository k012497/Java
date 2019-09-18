package chapter18.server_socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest {
	   public static void main(String[] args) throws UnknownHostException, IOException {
	      Socket socket = new Socket("192.168.112.23",9100);
	      
	      InputStream is = socket.getInputStream();
	      OutputStream os = socket.getOutputStream();
	      BufferedOutputStream bos = new BufferedOutputStream(os);
	      PrintStream ps = new PrintStream(bos);
	      
	      ps.println("꼬로록𓆝𓆟𓆜𓆞𓆡𓆝𓆟𓆜𓆞"); //바로 진행
	      ps.flush();
	      //ps.close();
	      
	      InputStreamReader isr = new InputStreamReader(is);
	      BufferedReader br = new BufferedReader(isr);
	      
	      System.out.println("서버로부터 답변을 기다리고 있습니다.");
	      String data = br.readLine(); // 대기 상태 (블럭) 
	      System.out.println(data);
	      br.close();
	   }
	}
