package chapter04;

public class GetMinMax {

	public static void main(String[] args) {
		int minimum = 0, maximum = 0;
		int s[] = { 12, 3, 19, 6, 18, 12, 4, 1, 19 };

		minimum = s[0];
		maximum = s[0];

		for (int i = 0; i < s.length; i++) {
			if (minimum > s[i])	minimum = s[i];
			if (maximum < s[i])	maximum = s[i];
		}

		System.out.println("최소값은 " + minimum);
		System.out.println("최대값은 " + maximum);

	}

}
