package chapter15.step15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*
		 * 문제 9
		 */
//		String[] s = { "사과", "배", "바나나"};
//		ArrayList list = new ArrayList(Arrays.asList(s));
//	
//		list.add("포도"); System.out.println(list);
//		list.add(2, "자몽"); System.out.println(list);
//		System.out.println(list.get(3));
//		list.remove(1); System.out.println(list);
//		System.out.println(list.contains("사과"));
//		System.out.println(list.indexOf("사과"));
		
		/*
		 * 문제 10
		 */
//		List l = new ArrayList<Double>();
//		
//		l.add(1.1);
//		l.add(2.2);
//		l.add(3.3);
//		l.add(4.4);
//		
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
//		System.out.println();
//		
//		for (Object object : l) {
//			System.out.println(object);
//		}
//		System.out.println();
//		
//		Iterator iterator = l.iterator();
//		while(iterator.hasNext()) {
//			Double d = (Double) iterator.next();
//			System.out.println(d);
//		}

		/*
		 * 문제 11
		 */
		List l2 = new ArrayList<String>();
		
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("d");
		
		for (Object object : l2) {
			System.out.println(object);
		}
		
		
	}

}
