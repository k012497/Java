package chapter04;
//어떤 거라도 클래스화할 수 있다는 거 보여주려고 만들어 본 것

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//원래 한 클래스에 다 집어넣던거 분리시키기 
public class BookingTest2 {
	
	public static void main(String[] args) {
		//1. 객체를 선언한다.
		Book book = new Book(0); //1번과 2번 완료 !
		
		book.printSeat();
		for(;;) {
				//4. 예약을 받는다. 
				book.inputSeatNumber();
				
				//5. 좌석번호가 예약되어 있는지 점검한다.
				int[] seat = book.getSeat();
				
				if (seat[book.getSeatNum()- 1] == 1) {
					System.out.println("이미 예약된 좌석입니다. ");
				}
				else {
					seat[book.getSeatNum()-1] = 1;
					System.out.println("예약이 완료되어씁ㄴ디ㅏ!!!!!");
					book.printSeat();
				}
			}
			
		}
		
	}
