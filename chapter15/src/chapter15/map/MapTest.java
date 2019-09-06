package chapter15.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("1", new Student(1, "Koo")); //put instead of add
		hm.put("2", new Student(2, "Keum"));
		hm.put("3", new Student(3, "Yun"));
		
		System.out.println(hm);
		hm.remove("1"); //remove
		System.out.println(hm);
		
		hm.put("3", new Student(3,"So"));
		System.out.println(hm);
		
		//for-each문 - Map을 Set으로 바꾸어서 그 안의 데이터를 가져오는 것
		//맵.entrySet() -> 분리하기 위해 맵을 Set구조로 바꾸는데 Set<Entry<String.Student>
		for(Entry<String,Student> set :hm.entrySet()) {//key, value 분리 
			String str = set.getKey();
			Student stu = set.getValue();
			System.out.println(str + " = " + stu.name +" "+ stu.number);
		}
		
		
	}

}
