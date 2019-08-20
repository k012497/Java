package chapter03;

import java.util.Scanner;

public class Gcd2 {
	public static void main(String[] args) {
		// 1. x, y값 입력 받기
		int x = inputValue();
		int y = inputValue();
		int temp = 0;

		// 2. x, y 대소 입력 받기
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}

		// 3. 최대공약수 구하기
		while (true) {
			if (y == 0) {
				System.out.println("최대공약수는 " + x);
				break;
			} else {
				temp = x % y;
				x = y;
				y = temp;
			}
		}
	}

	public static int inputValue() {
		int value = 0;
		do {
			System.out.print("1~100의 수를 입력 : ");
			Scanner scan = new Scanner(System.in);
			value = scan.nextInt();
		} while (value < 1 || value > 100);

		return value;
	}
}
