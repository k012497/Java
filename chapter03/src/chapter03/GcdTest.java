package chapter03;

import java.util.Scanner;

public class GcdTest {

	public static void main(String[] args) {
		//1. 두 값을 입력 받음 (1~100) 함수화 하기 
		int x = 0, y = 0, temp = 0, gcd = 0;
		
		x = inputValue();
		y = inputValue();
		
		//2. 두 수의 크기를 비교. 큰 값을 x, 작은 값을 y
		if(x<y) {
			temp = x;
			x = y;
			y = temp;
		}
		
		//3. 최대공약수 무한 루프. 함수화 하기 (x,y 전달받기) 
		gcd = gcdPrint(x, y);
		System.out.println("최대 공약수 = " + gcd);
		
	}
	
	public static int inputValue() {
		int num = 0;
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("1~100 정수를 입력해주세요 : ");
		num = input.nextInt();} while(num < 1 || num > 100);
		
		return num;
	}
	
	public static int gcdPrint(int x, int y) {
		int gcd = 0, temp = 0;
		
		while(true) {
			if (y == 0) {
				gcd = x;
				break;
			}
		
			temp = x % y;
			x = y;
			y = temp;
		}
		
		return gcd;
	}

}
