package chapter04;

import java.util.Scanner;

public class HexaToBinary {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int number = 0;
		String binaryStr = null;
			//16진수 문자열을 받는다. (대문자 생략)
		System.out.print("16진수 문자열 입력요망 ");
		String hexaValue = scan.nextLine();
		
		//원하는 값 뽑아내기 
		for (int i = 0; i < hexaValue.length(); i++) {
			char charValue = hexaValue.charAt(i);
			if(charValue >= '0' && charValue <= '9') {
				number = charValue - '0'; //아스키코드 
			} else if(charValue >= 'a' && charValue <= 'f') {
				number = charValue - 'a' + 10;
			} else if(charValue >= 'A' && charValue <= 'F') {
				number = charValue - 'A' + 10;
			}
		binaryStr = toBinaryString(number);
		System.out.print(binaryStr);
		
		}
	
	}
	//2진수 변환 함수 
	public static String toBinaryString(int number) {
		String str = null;
		str = Integer.toBinaryString(number);
		while(str.length() < 4) {
			str = "0" + str;
		}
		return str;
	}

}
