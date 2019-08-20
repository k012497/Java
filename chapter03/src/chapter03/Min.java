package chapter03;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		int temp = 0, min = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("3개의 정수를 엔터로 구분하여 입력 ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		min = (num1 < num2) ? num1 : num2;
		min = (num3 < num1) ? num3 : num1;
		
		System.out.println("가장 작은 값 : " + num1);
		
	}

}
