package chapter04;

import java.util.Arrays;

public class GetMin {

	public static void main(String[] args) {
		final int INDEX = 10;
		int minimum = 0;
		// 1. 정수형배열 객체를 만든다. 객체명 s, 초기값10개 선언
		int[] s = new int[INDEX];

		// 2. 랜덤으로 10~50까지 배열객체에 저장한다.
		inputIntArray(s);

		// 3. 첫 번째 배열 객체 요소를 min값으로 저장
		minimum = s[0];

		// 4.모든 배열 객체 요소를 차례대로 대소 비교하여 값을 수정
		for (int i = 0; i < s.length; i++) {
			if (minimum > s[i]) minimum = s[i];
		}

		// 5. 최소값을 출력
		System.out.println("최소값 = " + minimum);
		System.out.println(Arrays.toString(s));

	}

	public static void inputIntArray(int[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * (50 - 10 + 1) + 10);
		}
		
		return;
	}
}
