package chapter03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int score = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("성적을 입력하시오 : ");
			score = scan.nextInt();
		} while (score > 100 || score < 0);

		/*
		 * switch (score / 10) { case 10: case 9: System.out.println("학점 A"); break;
		 * 
		 * case 8: System.out.println("학점 B"); break;
		 * 
		 * case 7: System.out.println("학점 C"); break;
		 * 
		 * default: System.out.println("학점 F "); break; }
		 */

		if (score >= 90)
			System.out.println("학점 A ");
		else if (score >= 80)
			System.out.println("학점 B");
		else if (score >= 70)
			System.out.println("학점 C");
		else if (score >= 60)
			System.out.println("학점 D");
		else
			System.out.println("학점 F");

	}
}
