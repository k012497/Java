package chapter17.copy_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		fi = new FileInputStream("dog.jpg");
		fo = new FileOutputStream("copydog.jpg"); //만들어놔도 되고 없으면 만들어 줌. 
		
		int data; //초기값 없는데 왜 에러 안 뜸?
		while((data = fi.read()) != -1) {
			fo.write(data);
		}
		System.out.println("complete copy dog");
		
		if(fi != null) 	fi.close();
		if(fo != null)	fo.close();
		

	}

}
