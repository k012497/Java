package chapter03;

public class Sigma1 {

	public static void main(String[] args) {
		int result = 0;
		
		for (int i = 1; i <= 30; i++) {
			result += i*i + 1;
		}
		
		System.out.println(result);

	}

}
