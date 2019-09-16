package chapter17.char_encoding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
/*
 * print(화면에 출력)
 */
public class CharEncodingTest {

	public static void main(String[] args) throws IOException {
		// 입력하는 클래스 선언 
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		File file = null;
		
		// 입력 작업 진행
		file = new File("input.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis, "UTF-8");
		br = new BufferedReader(isr);
		
		// 출력 작업 진행 
		String data = null;
		while((data=br.readLine()) != null) {
			System.out.println(data);
		}
		
		if(br != null) br.close();

	}

}
