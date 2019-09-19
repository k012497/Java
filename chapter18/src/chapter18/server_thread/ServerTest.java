package chapter18.server_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ServerTest {
	public static Map<String, String> map = new HashMap<String, String>();// 왜 해시맵?

	public static void main(String[] args) {
		map.put("자바", "java");
		map.put("손잡이", "handle");
		map.put("컴퓨터", "computer");
		map.put("아이스크림", "ice cream");
		map.put("파일", "file");

		ServerSocket ss = null;
		System.out.println("server OPEN");
		try { // while 나가야 하니까 . 던지면 왜 안 됨?
			ss = new ServerSocket(2200);

			while (true) {
				Socket socket = ss.accept();
				Translator t;
				t = new Translator(socket);
				t.start();
			} // end of while
		} catch (IOException e) {
			System.out.println("error :( ");
		} finally {
			try {
				ss.close();
				System.out.println("server CLOSED");
			} catch (IOException e) {
			}
		}

	}// end of main

	public static class Translator extends Thread {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;

		public Translator(Socket socket) throws IOException {
			super();
			this.socket = socket;
			this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.pw = new PrintWriter(socket.getOutputStream(), true);
		}

		@Override
		public void run() {
			//1. 보낸다 
			pw.println(socket.getLocalPort() + "Hello" + socket.getLocalAddress().getHostAddress());
			try { //while문을 빠져나가도록 while밖으로 try/catch
				while (true) {
					//2. 5. 8.  보낸다 
					pw.println("Enter the word to translate");
					//3. 6. 9.  받는다
					String word = br.readLine(); //왜 throws 안 됨 ? 
					if(word == null) break;
					
					Boolean find = false;
					Set<Entry<String,String>> set = map.entrySet();
					//4. 7. 10. 보낸다
					for(Entry<String, String> s : set) {
						if(word.equals(s.getKey())) {
							pw.println(word + " is " + s.getValue());
							find = true;
							break;
						}
					}
					if(!find) pw.println(word + " NOT FOUND. . .  정신차려!!!!");
					
				}//end of while
			} catch (IOException e) {
				System.out.println("reading error");
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					System.out.println("closing error");
				} //end of try/catch 2
			}//end of try/catch 1
		}// end of run()

	}// end of Translator

}
