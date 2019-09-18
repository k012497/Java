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
/*
 * 시험 연습 
 */
public class Student implements Serializable{

	public int number;
	public String name;
	public String phoneNum;
	
	public Student() {
		System.out.print("번호 입력 : ");
		this.number = s.nextInt();
		System.out.print("이름 입력 : ");
		this.name = s.next();
		System.out.print("전화번호 입력 : ");
		this.phoneNum = s.next();
	}

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> list = new ArrayList<Student>();
		
		System.out.print("몇 명을 입력하겠습니까? ");
		int numToSave = s.nextInt();
		for (int i = 0; i < numToSave; i++) {			
			list.add(new Student());
		}
		
		File file = new File("person.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		if(oos != null) oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList getList = (ArrayList)ois.readObject();
		
		System.out.print("찾을 사용자 번호 : ");
		int numToFind = s.nextInt();
		
		Iterator<Student> iter = getList.iterator();
		Student student = null;
		Boolean find = false;
		while(iter.hasNext()) {
			student = iter.next();
			if(student.number == numToFind){
				System.out.println(student.phoneNum);
				find = true;
			}
		}
		if(!find) {
			System.out.println("찾을 수 없습니다");
		}
		
	} //end of main

}//end of class
