package chapter05;

public class SumTest {

	public static void main(String[] args) {
		Sum num1 = new Sum();
		System.out.println(num1.sum(1, 2));
		System.out.println(num1.sum(1,2,3));
		System.out.println(num1.sum(2.0, 3.0));
	}

}
