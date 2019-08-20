package chapter03;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0 || i % 3 == 0)
				sum += i;
		}
		
		System.out.println(sum);
	}

}
