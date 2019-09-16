package chapter17.data_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrintData {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = null;
		FileInputStream fis = null;		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		File file1 = null;
		
		file1 = new File("test.txt");
		fos = new FileOutputStream(file1);
		dos = new DataOutputStream(fos);
		
		dos.writeInt(1);
		dos.writeLong(555555555);
		dos.writeFloat(2.0f);
		dos.writeDouble(12.34);
		
		File file2 = new File("test.txt");
		fis = new FileInputStream(file2);
		dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
	}

}
