package chapter04;

public class Histogram2 {
	public static final int SIZE = 10;

	public static void main(String[] args) {
		int[] countArr = new int[SIZE]; // 객체 만들면 값 안 줘도 디폴트값이 들어간다.
		int randomNum = 0;

		for (int i = 0; i < SIZE; i++) {
			randomNum = (int) (Math.random() * (100 - 1 + 1) + 1);
			countArr[(randomNum - 1) / 10]++;
		}

			// countArr에 누적된 만큼 출력
		for (int j = 0; j < countArr.length; j++) {
			System.out.print((( 10 * j ) + 1) + " - " + (10 * ( j + 1 )) + " : " );
			for (int k = 0; k < countArr[j]; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
