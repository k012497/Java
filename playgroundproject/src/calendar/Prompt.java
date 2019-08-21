package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 8;
		int year = 2019;

		while (true) {
			System.out.println("년도를 입력하세요 ");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.print("달을 입력하세요: ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				System.exit(0);
			} else if (month > 12 || month < -1) {
				continue;
			}
			cal.printCalender(year, month);
		}
	
	}

	public static void main(String[] args) {	
		Prompt p = new Prompt();
		p.runPrompt();
	}
	


}
