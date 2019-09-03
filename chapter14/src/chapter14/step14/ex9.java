package chapter14.step14;

public class ex9 {

	public static void main(String[] args) {
		try {
			someMethod();
			System.out.println("A");
		} catch (Exception ex) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");

	}

	private static void someMethod() {
	}

}
