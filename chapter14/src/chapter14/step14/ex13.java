package chapter14.step14;

public class ex13 {

	public static void main(String[] args) {
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please check out array index");
		}
	}

	private static void sub() {
		int[] array = new int[10];
		int i = array[10];
	}

}
