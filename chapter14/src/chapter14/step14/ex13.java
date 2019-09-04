package chapter14.step14;

public class ex13 {

	public static void main(String[] args) {
		sub();
	}

	private static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		try {
			int i = array[10];
		} catch (Exception e) {
			System.out.println("please check out array index");
		}
	}
}
