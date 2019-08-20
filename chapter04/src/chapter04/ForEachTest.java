package chapter04;

public class ForEachTest {

	public static void main(String[] args) {
		// 1.정수형 배열 객체를 3개 선언
		// int[] numbers = new int[] { 10, 20, 30 };
		// ForEach fe = new ForEach();

		ForEach forEach = new ForEach(new int[] { 1, 2, 3 });

		// 2. 배열객체를 일반 포문 활용하여 출력한다.
		forEach.generalFor();

		System.out.println("");

		// 3. 향상된 포문을 활용한다.
		forEach.improvedFor();

	}

}
