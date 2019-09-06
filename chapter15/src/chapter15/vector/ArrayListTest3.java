package chapter15.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {

		MyClass[] mc = {new MyClass(10), new MyClass(20), new MyClass(30)};
		List<MyClass> list =Arrays.asList(mc);
		
		
		//1. 컬렉션에서 반복자 만들기. 반드시 해당된 클래스 타입으로 받아라.
		Iterator<MyClass> iter =list.iterator(); //하향형변환 자신있으면 Iterator
		
		//2. 반복문을 통해서 객체를 가지고 있는지 확인. hasNext() : 다음 객체 줄 게 있어용!
		while(iter.hasNext()) {
			//3. 객체 주세용!
			MyClass mc1 =iter.next();
			System.out.println(mc1.number);
		}
	
		
	}
}