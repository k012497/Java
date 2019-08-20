package chapter03;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("이진법으로 변환할 숫자 입력 : ");
		number = input.nextInt();

		System.out.print(number + "을 이진법으로 변환하면 ");
		toBinary(number);

	}

	public static void toBinary(int number) {
		String strValue = Integer.toBinaryString(number);

		while (strValue.length() < 32) {
			strValue = "0" + strValue;
		}

		System.out.println(strValue);

	}

}
