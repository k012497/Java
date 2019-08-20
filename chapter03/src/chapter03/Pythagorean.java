package chapter03;

public class Pythagorean {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;

		for (a = 1; a <= 100; a++) {
			for (b = 1; b <= 100; b++) {
				for (c = 0; c <= 100; c++) {
					if(a*a + b*b == c*c)
						System.out.println(a + ", " + b + ", " + c);
				}
			}
		}

	}

}
