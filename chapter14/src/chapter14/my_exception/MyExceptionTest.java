package chapter14.my_exception;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	private static void method1() throws MyException {
		throw new MyException("user defined exception! 조심하세요 "); //이 예외를 만들어주지 않으니까 던져줘야 함 
	}

}
