package chapter14.try_catch;

public class BadIndex {
	public static final int NUM;
	static {
		NUM = 10;
	}

	public static void main(String[] args) throws Exception { //JVM이 메인 불렀으니까 JVM한테 throw 하는 것 
		int[] array = new int[NUM];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			//System.out.print(array[i]+" ");
		}
		
		try {
			testPrint();
		} catch (ArithmeticException e) {
			System.out.println("12. program error ");
			//throw new RuntimeException();
		}

		int result = 0;
		
		// try catch 1
		try {
			result = array[12]; // 인덱스 넘어가도 빨간줄 안 뜸
			System.out.println("1 과연 이 문장이 실행 될까요?");// 실행 안 함 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2 Out of Bounds");
			result = array[NUM - 1];
		} finally {
			System.out.println("3 success!");
			System.out.println("4 결과값 " + result);
		}

		// try catch 2
		try {
			result = array[5]; // 정상 범위
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
			result = array[NUM - 1];
		} finally { //finally는 throw 이후에도 실행 됨 
			System.out.println("success!");
			System.out.println("과연 이 문장이 실행될까요? " + result);
		}

	}

	private static void testPrint() throws Exception{
		System.out.println("11. run function ");
		int number = 0;
		number = 10 / 0; //exception
		System.out.println("12. output = "+number); // 실행 안 됨 
		System.out.println("13. terminate this function"); //실행 안 됨 
		
	}

}
