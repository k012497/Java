package chapter05;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String str = null; // 지역변수니까 초기값 주기
		Scanner scan = new Scanner(System.in);
		System.out.print("사이트를 입력하세요 : ");
		str = scan.nextLine();
		
		if (str.equals("quit")) { // 리턴값이 true/false이므로 비교연산 안 써도
			System.exit(0);
		} else if (str.matches("^www\\.(.+)")) {
			System.out.println("첫 단어를 www. 로 입력하셨습니다. ");
		} else {
			System.out.println("첫 단어를 www.로 하라고 ");
		}

	}

}
