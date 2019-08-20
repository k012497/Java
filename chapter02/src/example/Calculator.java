package example;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		String result = "";

		Scanner input = new Scanner(System.in);
		System.out.print("정수: "); // 입력 안내 출력
		int value = input.nextInt();

		result = toBinaryString(value);
		System.out.println(result);

	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
