package calendar;

import java.util.Scanner;


public class Prompt {

	public int dayOfWeek(String dayofweek) {
		switch (dayofweek) {
		case "sunday":
			return 0;
		case "monday":
			return 1;
		case "tuesday":
			return 2;
		case "wednesday":
			return 3;
		case "thursday":
			return 4;
		case "friday":
			return 5;
		case "saturday":
			return 6;
		default:
			System.out.println("sunday~saturday중 입력 ");
			break;
		}
		
			return 0;
	}
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int dayValue = 0;
		int month = 8;
		int year = 2019;
		String str_dayOfWeek= "sunday";

		while (true) {
			System.out.println("년도를 입력하세요 (exit: -1) ");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year== -1) {
				System.out.println("Have a nice day!");
				System.exit(0);
			} else if (year < -1) {
				continue;
			}
			System.out.print("달을 입력하세요 1~12 ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if(month < 1 || month >12) {
				System.out.println("wrong value");
				continue;
			}
			System.out.print("시작 요일을 입력하세요 sunday~saturday ");
			System.out.print("DAY_OF_WEEK> ");
			str_dayOfWeek = scanner.next();
			dayValue = dayOfWeek(str_dayOfWeek);

			cal.printCalender(year, month, dayValue);
		}

	}

	public static void main(String[] args) {	
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
