package chapter18.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) throws IOException {
		//File file = new File("index.html");
		URL url = new URL("http://www.nate.com:80/index.html");
		
		//FileInputStream fs = new FileInputStream(file);
		URLConnection urlCon = url.openConnection();
		InputStream is = urlCon.getInputStream(); //메소드를 통해 얻어온다. 
//		InputStream is = url.openStream();
		
		//InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(is);
		
		//BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(isr);
		
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		
		if(br != null){ br.close();}
	}

}
