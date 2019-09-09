package chapter15.collections_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		//문자열 배열 선언 5개
		String[] str = new String[] {"zzz", "eee", "ccc", "ddd", "aaa"};
		
		//배열을 List로 바꾸기 
		List<String> list= Arrays.asList(str);
		
		//List iterator출력 
		iteratorPrint(list);
		
		//List sort
		System.out.println("=====");
		Collections.sort(list);
		iteratorPrint(list);
		
		System.out.println("=====");
		str = (String[])(list.toArray()); //배열로 출력. Object[]로 반환하니까 하향형변환 
		for(String s: str) {
			System.out.println(s);
		}

	}
	
	public static void iteratorPrint(List<String> list) {
		Iterator<String> iterator = list.iterator();
				
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
