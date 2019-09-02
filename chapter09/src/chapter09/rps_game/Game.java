package chapter09.rps_game;

import java.util.Scanner;

public class Game {
	int userValue;
	int comValue;
	
	public Game() {
		comValue = (int)(Math.random()*3);
		userValue = 0;
	}
	
	public int getComValue() {
		return comValue;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("하나를 선택하시오 - 가위(0), 바위(1), 보(2) : ");
		int userValue = scan.nextInt();
		
		Game game = new Game();
		
		int comValue = game.getComValue();
		switch (comValue) {
		case 0:
			System.out.println("컴퓨터는 가위를 선택합니다."); break;
		case 1:
			System.out.println("컴퓨터는 바위를 선택합니다."); break;
		case 2:
			System.out.println("컴퓨터는 보위를 선택합니다."); break;
		default:
			break;
		}

		int result = userValue - comValue;
		switch (result) {
		case 1: case -2:
			System.out.println("win "); break;
		case -1: case 2:
			System.out.println("lose "); break;
		case 0:
			System.out.println("draw "); break;

		default:
			break;
		}
			
	}


}
