package chpater17.object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student student = new Student(10, "김소진");
		oos.writeObject(student);
		
		if(oos != null) oos.close();
		
		System.out.println("완료 :)");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student std = (Student)ois.readObject();
		
		System.out.println(std);
		
	}

}
