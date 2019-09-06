package chapter15.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
//		String str1 = new String("butter"); 이렇게 하고 add(str1)하는 게 정상 
		
		//add
		al.add("milk");
		al.add("bread");
		al.add("butter");
		al.add(1, "APPLE");
		
		//remove
		al.remove("butter"); //String은 문자같으면 새로 안 만듦 
		
		
		//iterator
		Iterator<String> iter = al.iterator(); //swing 말고 util	import하기! 
		while(iter.hasNext()) {
			String str = iter.next(); //Iterator 제네릭을 밝혔으므로 하향형변환을 할 필요 없음. > String을 반환함. 
			System.out.println(str);
		}
		
		
	}

}
