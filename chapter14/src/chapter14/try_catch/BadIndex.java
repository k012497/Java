package chapter14.try_catch;

public class BadIndex {
	public static final int NUM;
	static {
		NUM = 10;
	}

	public static void main(String[] args) {
		int[] array = new int[NUM];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		int result = 0;
		
		// try catch 1
		try {
			result = array[12]; // 인덱스 넘어가도 빨간줄 안 뜸
			System.out.println("과연 이 문장이 실행 될까요?");// 실행 안 함 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
			result = array[NUM - 1];
		} finally {
			System.out.println("success!");
			System.out.println("결과값 " + result);
		}

		// try catch 2
		try {
			result = array[5]; // 정상 범위
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
			result = array[NUM - 1];
		} finally {
			System.out.println("success!");
			System.out.println("과연 이 문장이 실행될까요? " + result);
		}

	}

}
