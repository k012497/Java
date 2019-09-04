package chapter14.io_exception;

import java.io.IOException;

public class Test {
	
	public static final int SIZE = 100;

	public static void main(String[] args) throws IOException {
		System.out.println(readString());
		
	}

	public static String readString() throws IOException  {
		byte[] buf = new byte[SIZE];
		System.out.print("문자열을 입력하시오 : ");
		System.in.read(buf);
		throw new IOException(); //뒷문장은 실행 안 함 
//		return new String(buf); //던졌는데 또 리턴해서 
	}

}
