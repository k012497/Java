package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class Book {

	//1. 멤버 변수. 항상 접근 제어자 써 주기!!. 초기값줄필요없다. 생성자에서 다 주니까. 
	private static final int COUNT = 10; //정적멤버  
	private int[] seat = new int[COUNT]; //정적멤버 
	private static Scanner scan = new Scanner(System.in); //정적멤버변수 
	private int seatNum; //인스턴스 멤버 변수 
	//사실 public 하면 캡슐화에 위배 >>private로 바꿔야 한다. >>외부접근시 문제됨. 자기멤버변수를 가져오고 세팅하는 Setters, Getters 
	
	//3. 생성자 함수 - 생성자는 리턴값 없다. //리턴값없고 클래스 사용(대문자)
	public Book (int init) {
		for (int i = 0; i < seat.length; i++) {
			seat[i] = init;
		}

	}
	
	public int[] getSeat() {
		return seat;
	}

	public void setSeat(int[] seat) {
		this.seat = seat;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	//2.멤버 함수
	public void inputArrayValue() { //같은 멤버함수니까 스태틱 필요없. int[] seat도 안 써도 됨(자기 멤버니까) 
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 초기값 = ");

		int initValue = scan.nextInt();
		for (int i = 0; i < seat.length; i++) {
			seat[i] = initValue;
		}
		return;
	}
	public void printSeat() {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(seat));
		return;
	}
	public void inputSeatNumber() { //static쓰면 안 되는 이유 ? 
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
	}
	
	public static void main(String[] args) { 

	}

}
