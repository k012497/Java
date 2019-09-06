package chapter15.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		al.add(new MyClass(10));
		al.add(new MyClass(20));
		al.add(new MyClass(30));
		al.add(new MyClass(40));
		
		//1. 컬렉션에서 반복자 만들기. 반드시 해당된 클래스 타입으로 받아라.
		Iterator iter =al.iterator(); //하향형변환 자신있으면 Iterator
		//2. 반복문을 통해서 객체를 가지고 있는지 확인. hasNext() : 다음 객체 줄 게 있어용!
		while(iter.hasNext()) {
			//3. 객체 주세용!
			MyClass mc =(MyClass)iter.next();
			System.out.println(mc);
		}
		
	}
}
