package chapter17.char_encoding;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * FileWriter - OutputStreamWriter - BufferedOutputStream  >> 잘못된 설계 
 */
public class CharEncodingTest2 {

	public static void main(String[] args) throws IOException {
		// 입력하는 클래스 참조변수 선언 
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		File file = null;
		
		// 출력하는 클래스 참조변수 선언
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		File file2 = null;
		
		// 입력 작업 진행
		file = new File("input.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis, "UTF-8");
		br = new BufferedReader(isr);
		
		// 출력 작업 진행 
		file2 = new File("output5.txt");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		String data = null;
		while((data=br.readLine()) != null) {
			System.out.println(data);
			data += "\n";
			byte[] b = data.getBytes(); //문자열을 바이트 배열로 바꿈 
			bos.write(b);
		}
		System.out.println("complete saving");
		
		if(br != null) br.close();
		if(bos != null) bos.close();

	}

}
