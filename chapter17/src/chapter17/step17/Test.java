package chapter17.step17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 시험 
 */

public class Test implements Serializable{
	
	public String address;
	public int birthday;
	public String name;
	
	public Test(String address, int birthday, String name) {
		this.address = address;
		this.birthday = birthday;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[address=" + address + ", birthday=" + birthday + ", name=" + name + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Test> list = new ArrayList<Test>();
	
		list.add(new Test("Seoul", 970124, "sojin"));
		list.add(new Test("Seoul", 931127, "yejin"));
		list.add(new Test("Seoul", 961008, "hyojin"));
		list.add(new Test("Seoul", 880124, "gildong"));
		list.add(new Test("Seoul", 930909, "haneul"));
		
		File file = new File("test.data");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		if(oos != null) oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList getList = (ArrayList)ois.readObject();
		
		Iterator iter = getList.iterator();
		
		Test test = null;
		Test gildong = null;
		while(iter.hasNext()) {
			test = (Test)iter.next();
			System.out.println(test);
			if(test.name.equals("gildong")) gildong = test;
		}
		
		System.out.println("홍길동 INFORMATION : " + gildong);
		
		if (ois != null) ois.close();
	}

}
