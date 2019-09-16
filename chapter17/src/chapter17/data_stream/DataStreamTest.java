package chapter17.data_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		//파일을 읽어오는 클래스 참조변수 선언 
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		File file = null;
		
		//파일에 저장하는 클래스 참조변수 선언
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		File file2 = null;
		
		//파일에 저장하는 기능 
		file2 = new File("data.bin");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		dos = new DataOutputStream(bos);
		
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
		dos.flush(); //버퍼에 저장된 게 바로 저장됨.
		if(dos != null) dos.close();
		System.out.println("Complete");
		
		file = new File("data.bin");
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		
		//주의! 꼭 쓰여진 순서대로 읽어와야 함. >> DB가 없으니 불편한 점 
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		
		if(dis != null) dis.close();
		
		
	}

}
