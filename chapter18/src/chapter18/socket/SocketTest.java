package chapter18.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("time-c.nist.gov", 13);
		InputStream is = s.getInputStream(); //읽을거니까 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		
		br.close();
		
		System.out.println("finish");
	}

}
