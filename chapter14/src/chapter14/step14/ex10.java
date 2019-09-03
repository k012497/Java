package chapter14.step14;

public class ex10 {
	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 5 / x;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Finished");
	}

}
