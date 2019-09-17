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
import java.util.Scanner;

public class Data implements Serializable{
	public int number;
	public String name;
	public String phoneNum;
	public String eMailAddress;
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		System.out.print("몇 명의 정보를 입력하시겠습니까? : ");
		int numToSave = s.nextInt();
		for (int i = 0 ; i < numToSave ; i++) {
			list.add(makeObject());
		}
		
		File file = new File("personInfo.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		if(oos != null) oos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList readList = (ArrayList)ois.readObject();
		
		System.out.print("\n전화번호를 조회할 사용자의 번호 입력: ");
		int numToFind = s.nextInt();
		
		Iterator iter = readList.iterator();
		Data person = null;
		while(iter.hasNext()) {
			person = (Data) iter.next();
			if(person.number == numToFind)
				System.out.print(person.phoneNum);
			else
				System.out.println("찾을 수 없습니다. ");
		}
		
		if(ois != null) ois.close();	
	}
	
	public static Data makeObject() {
		Data data = new Data();
		
		System.out.print("\n사용자 번호 입력: ");
		data.number = s.nextInt();
		System.out.print("사용자 이름 입력: ");
		data.name = s.next();
		System.out.print("사용자 전화번호 입력: ");
		data.phoneNum = s.next();
		System.out.print("사용자 이메일 주소 입력: ");
		data.eMailAddress = s.next();
		
		return data;
	}
}


