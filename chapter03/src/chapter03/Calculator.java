package chapter03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String input = "";
		int result = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("연산자 입력 : ");
		input = scan.next();

		System.out.print("정수  입력 : ");
		num1 = scan.nextInt();

		System.out.print("정수  입력 : ");
		num2 = scan.nextInt();

		char operation = input.charAt(0);

		if (operation == '+')
			result = num1 + num2;

		else if (operation == '-')
			result = num1 - num2;

		else if (operation == '*')
			result = num1 * num2;

		else if (operation == '/')
			result = num1 / num2;

		else
			System.out.println("사칙 연산자를 입력하세요 ");

		System.out.println("연산 결과 : " + result);

	}

}
