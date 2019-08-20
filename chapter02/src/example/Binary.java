package example;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("2진법으로 바꿀 정수값 입력 : ");
		num = scan.nextInt();
		String strValue = toBinary(num);
		System.out.println(num+"을 2진법으로 변환하면 " + strValue);

	}

	public static String toBinary(int num) {
		String strValue = Integer.toBinaryString(num);
		System.out.println("2진법으로 변환된 문자열 길이 : " + strValue.length());
		while (strValue.length() < 32) {
			strValue = "0" + strValue;
		}

		return strValue;
	}

}
