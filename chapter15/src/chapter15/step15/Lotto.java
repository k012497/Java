package chapter15.step15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lotto {
	public static final int COUNT = 6;
	public static void main(String[] args) {
//		Set<Integer> lotto = new TreeSet<Integer>(); //TreeSet으로 하면 정렬되어 입력 된다. 
		Set<Integer> lotto = new HashSet<Integer>(); 
		for (int i = 0 ; i < COUNT ; i++) {
			int num = (int)(Math.random()*45)+1;
			if(lotto.contains(num)) {
				System.out.println("중복된 숫자 발생 ");
				i--;
			}else {				
				lotto.add(num);
			}	
		}
		
		Iterator iterator = lotto.iterator();
		while(iterator.hasNext()) {
			System.out.println((int) iterator.next()); 
		}
		
		//sort 		
		System.out.println("\n>>> after sort >>>");
		List<Integer> list = new ArrayList<Integer>(lotto);
		Collections.sort(list);
		
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			System.out.println((int) iterator2.next()); 
		}
		
	}

}
