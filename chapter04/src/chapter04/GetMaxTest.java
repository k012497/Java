package chapter04;

public class GetMaxTest {

	public static void main(String[] args) {
		int max = 0;

		// 1. 배열 선언 (10개 )
		int[] array = new int[10];

		// 2. 배열 10개 랜덤 (1~20)저장, (for, length)
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (20 - 1 + 1) + 1);
		}

		// 3. max값을 찾아서 리턴하는 함수
		max = findMaxValue(array);

		// 4. 메인 함수에서 최대값을 출력
		System.out.println("최대값은 " + max);

	}

	public static int findMaxValue(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) max = array[i];
		}
		return max;
	}

}
