package chapter04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//원래 한 클래스에 다 집어넣던거 분리시키기 
public class BookingTest {

	public static Scanner scan = new Scanner(System.in); //클래스 만들기 전에 만들어진다. 전역변수 역할!
	
	public static void main(String[] args) {
		
		// 1. 배열 선언 (10개)
		final int COUNT = 10;
		int[] seat = new int[COUNT];
		
		inputArrayValue(seat);
		//System.out.println(Arrays.toString(seat));
		printSeat(seat);
		
		for (int i = 0; i < seat.length; i++) {
			//4. 예약을 받는다. 
			int seatNum = inputSeatNumber();
			
			//5. 좌석번호가 예약되어 있는지 점검한다.
			if (seat[seatNum - 1] == 1) {
				System.out.println("이미 예약된 좌석입니다. ");
			}
			else {
				seat[seatNum-1] = 1;
				System.out.println("예약이 완료되어씁ㄴ디ㅏ!!!!!");
				printSeat(seat);
			}
		}
		
	}
	
	public static void printSeat(int[] seat) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(seat));
		return;
	}
	
	public static void inputArrayValue(int[] seat) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 초기값 = ");

		int initValue = scan.nextInt();
		for (int i = 0; i < seat.length; i++) {
			seat[i] = initValue;
		}
		return;
	}
	
	public static int inputSeatNumber() {
		int seatNum = 0;
		for(;;) {
			System.out.print("예약할 좌석(1~10)을 선택 하세요(종료는 -1): ");
			seatNum = scan.nextInt(); //문자열의 첫 번째만 받을 때. 왜 안 받아도 에러 안 뜸? 
			if(seatNum == -1) {
				System.out.println("안녕히 가세요 ");
				System.exit(0);
			}
			if(seatNum >= 1 && seatNum <= 10) break;
			System.out.println("정신차려!!!!");	
		}
		return seatNum;
	}
}
