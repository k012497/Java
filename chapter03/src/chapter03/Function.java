package chapter03;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		double x = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("실수 x값 입력 ");
		x = scan.nextDouble();

		if (x <= 0)
			System.out.println(x * x * x - 9 * x + 2);
		else
			System.out.println(7 * x + 2);

	}

}
