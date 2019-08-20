package chapter04;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("학생의 수를 입력하시오: ");
		num = scan.nextInt();

		int[] score = new int[num];

		for (int i = 0; i < num; i++) {
			for (;;) {
				System.out.print("학생 " + (i + 1) + "의 성적을 입력하시오: ");
				score[i] = scan.nextInt();

				if (score[i] <= 100 && score[i] >= 1) {
					sum += score[i];
					break;
				} else {
					System.out.println("잘못된 성적입니다. 다시 입력하시오. ");
				}
			}
		}

		System.out.println("성적 평균은 " + ((double)sum/(double)score.length) + "입니다.");

	}
}
