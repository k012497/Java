package chapter04;

import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		int num = 0;
		String quit ="";
		int[] seat = new int[10];
		Scanner scan = new Scanner(System.in);

		initArrayValue(seat);
		
		
		for (int i = 0; i < seat.length; i++) {
			System.out.println("=============================");
			for (int j = 0; j < seat.length; j++) {			
				System.out.print((j+1)+"  ");
			}
			System.out.print("\n");
			for (int k = 0; k < seat.length; k++) {			
				System.out.print(seat[k]+"  ");
			}
			System.out.println("\n=============================");
			System.out.print("원하시는 좌석 번호를 입력하세요 (종료는 -1): ");
			num = scan.nextInt();

			if (num == -1)
				return;
			else {
				if (seat[num - 1] == 1) {
					System.out.println("이미 예약된 자리입니다. ");
				} else {
					seat[num - 1] = 1;
					System.out.println("예약되었습니다.");
				}
			}
			
			System.out.println("계속 예약 하시겠습니까?");
			quit = scan.nextLine();
//			if (quit.charAt(0) == "y" || "Y") coninue;
//			else if (quit.charAt(0)=="n" || "N")) return;
			

		}

	}

	public static void initArrayValue(int[] seat) {
		for (int i = 0; i < seat.length; i++) {
			seat[i] = 0;
		}
	}
}
