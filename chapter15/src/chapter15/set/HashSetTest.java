package chapter15.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("aaaa");
		hs.add("bbbb");
		hs.add("cccc"); //중복 넣어도 에러 안 주고 알아서 빼버림 
		hs.add("cccc");
		hs.add("dddd");

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("hello");
		hs2.add("world");
		
		//출력
		iteratorPrint(hs);
		iteratorPrint(hs2);
		
		//합집합 
		hs.addAll(hs2);
		iteratorPrint(hs);
		
		//교집합 
		HashSet<String> retain = new HashSet<String>(hs); //hs 복사 
		retain.retainAll(hs2);
		iteratorPrint(retain);
		
		
	}//end of main

	private static void iteratorPrint(HashSet<String> hs) {
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			String str =iter.next();
			System.out.println(str);
		}
		System.out.println();
		
	}

}//end of class
