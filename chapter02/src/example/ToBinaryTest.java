package example;

import java.util.Scanner;

public class ToBinaryTest {
	public static void main(String[] args) {
		int number = 0;

		Scanner inputObject = new Scanner(System.in); // 입력을 받는 기계(초기화 세팅)를 만든 것
		System.out.print("2진법으로 바꿀 정수값 입력 요망 : ");
		number = inputObject.nextInt();
		String strValue = toBinaryString(number);
		System.out.println(number + "을 이진법으로 변환하면 " + strValue);
	}

	public static String toBinaryString(int value) {
		String strValue = Integer.toBinaryString(value); // new 안 했는데 객체? 안 써도 객체가 될 수 있는 것 : 싱글톤.
		System.out.println("2진법으로 변환돈 문자열 길이 : " + strValue.length());
		while (strValue.length() <= 32) { // 32비트니까
			strValue = "0" + strValue;
		}
		return strValue; // c.f. string defalut값은 null

	}
}
