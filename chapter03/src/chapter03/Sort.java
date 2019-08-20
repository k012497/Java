package chapter03;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, temp = 0;

		num1 = inputNumber();
		num2 = inputNumber();
		num3 = inputNumber();

		for (;;) {
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}

			if (num2 > num3) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}

			if (num1 <= num2 && num2 <= num3)
				break;
		}

		System.out.println("크기 순: " + num1 + " " + num2 + " " + num3);

	}

	public static int inputNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력 ");
		int num = scan.nextInt();
		return num;
	}

}
