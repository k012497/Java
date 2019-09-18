package chapter18.picture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DogPictureConnectionTest {

	public static void main(String[] args) throws IOException {
		//가져오기 
		URL url = new URL("http://t1.daumcdn.net/liveboard/petxlab/30493926bd1f4f749b310ada3d6634c7.JPG");
		
		//FileInputStream fs = new FileInputStream(file);
		URLConnection urlCon = url.openConnection();
		InputStream is = urlCon.getInputStream();
		
		//2byte로 받을 필요 없으니까 브릿지 안 씀 
		
		//BufferedReader br = new BufferedReader(isr);
		BufferedInputStream bis = new BufferedInputStream(is); 
		
		//저장하기 로직
		File file = new File("dog.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] buffer = new byte[1024];
		int size = 0;
		while((size = bis.read(buffer)) != -1) {
			bos.write(buffer, 0, size);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("colmplete copying the image from server");
		
	}

}
