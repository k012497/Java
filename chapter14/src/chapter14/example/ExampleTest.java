package chapter14.example;

public class ExampleTest {

	public static void main(String[] args) {
		int[] list = null;
		try {
			list[0] =0;
		} catch (NullPointerException e) {
			System.out.println("배열을 만들어주세요 ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
