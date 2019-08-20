package chapter03;

import java.util.Scanner;

public class StdWeight {

	public static void main(String[] args) {
		double weight = 0.0, height = 0.0;
		double standardWeight = 0.0;
		Scanner scan = new Scanner(System.in);

		System.out.print("키 입력 : ");
		height = scan.nextDouble();

		standardWeight = (height - 100) * 0.9;

		System.out.print("체중 입력 : ");
		weight = scan.nextDouble();

		if (weight > standardWeight)
			System.out.println("과체중 ");
		else if (weight == standardWeight)
			System.out.println("표준 체중 ");
		else
			System.out.println("저체중 ");

	}

}
