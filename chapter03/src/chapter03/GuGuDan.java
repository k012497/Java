package chapter03;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		int num = 0;
		int i = 0, j = 0;
		Scanner scan = new Scanner(System.in);

		for (i = 2; i < 10; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		
		/*
		do {
			System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오 : ");
			num = scan.nextInt();
		} while (num < 1 || num > 9);

		for (j = 1; j <= 9; j++) {
			System.out.println(num + "*" + j + "=" + num * j);

		}
		*/

	}

}
