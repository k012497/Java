/*
 * 로또 확률 계산 
 */

package chapter03;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 조합수열
		long selectNum = 0, totalNum = 0;
		long fact1 = 1, fact2 = 1;
		Scanner scan = new Scanner(System.in);
		//1. 두 수를 입력 받는다 
		do {
		System.out.print("총 몇 개? ");
		totalNum = scan.nextInt();
		System.out.print("몇 개 뽑음? ");
		selectNum = scan.nextInt();
		} while((totalNum < 1 || totalNum > 46) || (selectNum < 1 || selectNum > 45) );

		// for(1~6)
		for (int i = 1; i <= selectNum; i++) {
			fact1 *= (totalNum - i + 1);
			fact2 *= i;
		}

		System.out.println("로또 1등 확률 : 1/" + (fact1/fact2));

	}

}
