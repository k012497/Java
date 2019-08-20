package chapter03;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		int temp = 0;
	
		//값 입력 받기 
		int x = inputValue();
		int y = inputValue();
		
		//대소 비교 
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		
		//최대공약수 구하기 
		while (true) {
			if (y == 0) {
				temp = x;
				break;
			} else {
				temp = x % y;
				x = y;
				y = temp;
			}
		}
		
		// 최대공약수 출력 
		System.out.println("최대공약수는 " + temp);
	}
	// 1~100정수 입력 받는 함수 
	public static int inputValue() {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.print("1~100의 값을 입력하세요 ");
		value = scan.nextInt();
		}while(value < 1 || value > 100);
		
		return value;
	}
}
