package chapter17.copy_line;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyLinesTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileWriter fo = null;
		InputStreamReader isr = null;

		fi = new FileInputStream("input.txt"); // 1byte로 읽어서
		isr = new InputStreamReader(fi); // 한글 안 깨지게 하기.
		fo = new FileWriter("output3.txt"); // 2byte로 저장 

		int data = 0;
		while ((data = isr.read()) != -1) {// 1byte로 읽어서 2바이트로 바꿔서 data에 저장한 것 
			fo.write(data);// 2byte로 저장 
		}
		System.out.println("COMPLETE");

		if (fi != null)
			fi.close();
		if (fo != null)
			fo.close();

	}

}
