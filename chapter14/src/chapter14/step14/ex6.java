package chapter14.step14;

public class ex6 {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류 ");
		}finally {
			System.out.println("finally");
		}
	}

}
