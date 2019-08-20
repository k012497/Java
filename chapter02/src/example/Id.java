package example;

import java.util.Scanner;

public class Id {

	public static void main(String[] args) {
		long id = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민 입력 : ");
		id = input.nextLong();
		System.out.println(id);

	}

}
