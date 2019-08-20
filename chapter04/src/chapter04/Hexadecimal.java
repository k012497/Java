package chapter04;

import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		String hexa = "";

		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };

		// 1.16진수 문자열 입력
		System.out.print("16진수 문자열을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		hexa = scan.nextLine();

		for (int i = 0; i < hexa.length(); i++) {
			switch (hexa.charAt(i)) {
			case '0': System.out.print(hexa2bin[0] + " "); break;
			case '1': System.out.print(hexa2bin[1] + " "); break;
			case '2': System.out.print(hexa2bin[2] + " "); break;
			case '3': System.out.print(hexa2bin[3] + " "); break;
			case '4': System.out.print(hexa2bin[4] + " "); break;
			case '5': System.out.print(hexa2bin[5] + " "); break; 
			case '6': System.out.print(hexa2bin[6] + " "); break;
			case '7': System.out.print(hexa2bin[7] + " "); break;
			case '8': System.out.print(hexa2bin[8] + " "); break;
			case '9': System.out.print(hexa2bin[9] + " "); break;
			case 'a': case 'A': System.out.print(hexa2bin[10] + " "); break;
			case 'b': case 'B': System.out.print(hexa2bin[11] + " "); break;
			case 'c': case 'C': System.out.print(hexa2bin[12] + " "); break;
			case 'd': case 'D': System.out.print(hexa2bin[13] + " "); break;
			case 'e': case 'E': System.out.print(hexa2bin[14] + " "); break;
			case 'f': case 'F': System.out.print(hexa2bin[15] + " "); break;

			default:
				break;
			}
		}
	}
}
