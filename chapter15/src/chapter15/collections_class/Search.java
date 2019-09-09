package chapter15.collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search {

	public static void main(String[] args) {
		// 1. ArrayList<Integer>
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 2. 랜덤값으로 1~100
		for (int i = 0; i < 10000; i++) {
			list.add(i, (int) (Math.random() * (100 - 1 + 1) + 1)); // auto boxing
			System.out.print(list.get(i) + " ");
		}

		int index = Collections.binarySearch(list, 10); // 정렬이 안 되면 못 찾는다.
		System.out.println("\n" + index + " > 정렬이 안 되어 있음 \n");

		//정렬하지 않고 일반 검색 
		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			if (list.get(i) == 10)
				break;
		}
		long stop = System.nanoTime();
		System.out.println("일반 방법 검색 처리 시간 " + (stop - start) + "sec\n");

		// 3. 정렬 후 이진 검색 
		Collections.sort(list);
		for (Integer i : list) {
			System.out.print(i + " ");
		}

		start = System.nanoTime(); // 검색에 걸리는 시간 체크
		index = Collections.binarySearch(list, 10);
		stop = System.nanoTime();
		if (index < 0) {
			System.out.println("\n찾는 수가 없습니다 ");
		} else {
			System.out.println("\n" + index + "번째, " + (stop - start) + "nano sec");
		}

	}

}
