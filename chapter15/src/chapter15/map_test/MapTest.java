package chapter15.map_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();

		hm.put("1", new Student(1, "koo"));
		hm.put("2", new Student(2, "kim"));
		hm.put("3", new Student(3, "keum"));

//		Set<Entry<String, Student>> map = hm.entrySet();
//
//		for (Entry<String, Student> a : map) {
//			String str = a.getKey();
//			Student stu = a.getValue();
//			System.out.println(str + stu);
//		}

		System.out.println(hm.get("1"));
		
		//for-each 이용 출력 
		for (Map.Entry<String, Student> a : hm.entrySet()) {
			String str = a.getKey();
			Student stu = a.getValue();
			System.out.println(str + " " + stu);
		}
		
		ArrayList<Student> array = new ArrayList<Student>();
		//Iterator 이용 출력 
		System.out.println();
		Set<Map.Entry<String, Student>> set = hm.entrySet();
		Iterator<Map.Entry<String, Student>> entryIterator = set.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Student> entry = entryIterator.next();
			String key = entry.getKey();
			Student value = entry.getValue();
			//array.add(value); value만 받으려면 
			System.out.println(key + " " + value);
		}
	}
}
