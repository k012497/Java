package chapter03;

import java.util.Scanner;

public class Consonant {

	public static void main(String[] args) {
		String letter = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영문자를 입력: ");
		letter = scan.next();
		char alphabet = letter.charAt(0);
		
		//System.out.println(alphabet);
		
		switch (alphabet) {
		case 'a': case 'A': case 'e': case 'E': case 'i': case 'I':
		case'o': case 'O': case 'u': case 'U':
			System.out.println("자음 ");
			break;

		default:
			System.out.println("모음 ");
			break;
		}

	}

}
