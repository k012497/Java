package chapter14.step14;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		}catch(MyException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void checkNegative(int number) throws MyException{
		if(number<0) {
			System.out.println(new MyException("no negative"));
		}
		System.out.println("다행히 음수가 아니군요! ");
	}
}
