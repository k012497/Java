package chapter03;

import java.util.Scanner;

public class Pivonacci {
	public static void main(String[] args) {
		long a = 0, b = 1, c = 0;
		int i = 0, count = 0;

		System.out.print("몇 번째 항까지 출력할까요? ");
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		
		System.out.print(a + ", " + b + ", ");
		for (i = 2; i <= count-1; i++) {
			c = a + b;// 변수 a와 b를 더하여 변수 c에 대입한다.
			a = b;// 변수 b의 값을 변수 a로 옮긴다.
			b = c;// 변수 c의 값을 변수 b로 옮긴다.
			System.out.print(c + ", ");
		}


	}
}
