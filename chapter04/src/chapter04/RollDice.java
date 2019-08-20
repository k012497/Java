package chapter04;

public class RollDice {

	public static void main(String[] args) {
		final int SIZE = 6;
		int frequency[] = new int[SIZE];

		for (int i = 0; i < 10000; i++) {
			frequency[(int) (Math.random() * 6)]++;
		}

		System.out.println("======================");
		System.out.println("면    빈도 ");
		System.out.println("======================");

		for (int j = 0; j < SIZE; j++) {
			System.out.println((j + 1) + "    " + frequency[j]);

		}

	}

}
