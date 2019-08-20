package example;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// 문장을 사용자로부터 입력받는 방법 >> 외우기!
		// 1. Scanner 객체를 만든다.
		Scanner kangScanner = new Scanner(System.in);
		System.out.print("이름을 입력하시오.");

		// 2. 문자열nextLine, 문자 단어next, 정수값nextInt, 실수값nextDouble, 부울값nextBoolean
		String name = kangScanner.nextLine();
		System.out.println("당신의 이름은 " + name + "입니다 ");
		System.out.println("당신의 나이를 입력하시오. : ");
		int age = kangScanner.nextInt();
		System.out.println("당신의 나이는 " + age + "입니다 ");

	}

}
