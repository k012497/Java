package chapter03;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int performance= 0;
		double bonus = 0;

		System.out.print("실적을 입력하시오(단위 : 만원) : ");
		performance = scan.nextInt();

		if (performance >= 1000) {
			bonus = (performance - 1000) * 0.1;
			System.out.println("실적달성\n보너스: " + bonus);
		} else
			System.out.println("실적을 달성하지 못 했습니다 ㅠㅠ " + (1000 - performance) + "만원 미달 ");

	}

}
