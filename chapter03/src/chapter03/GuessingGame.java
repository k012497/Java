package chapter03;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// 1. 컴퓨터 값을 가져온다. (1~1000) -random()
		// 2. 무한루프. 사용자 입력 - 결과(낮습니다/높습니다/정답). count++
		// (1+1000)/2

		int answer = 0, inputValue = 0, cal = 0, count = 0, max = 100, min = 0;
		answer = (int) (Math.random() * (100 - 1 + 1) + 1);
		System.out.println(answer);
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("정답을 추측해 보세요 : ");
			inputValue = input.nextInt();
			cal = (min + max) / 2;
			count++;

			if (inputValue > answer) {
				System.out.println("더 낮음 (제시한 수가 더 높습니다) ");
				min = inputValue;
			} else if (inputValue < answer) {
				System.out.println("더 높음 (제시한 수가 더 낮습니다 ) ");
				max = inputValue;
			}
		} while (inputValue != answer);

		System.out.println("축하합니다 " + count);

	}

}
