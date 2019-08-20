package chapter03;

public class Dice {

	public static void main(String[] args) {
		int count = 0;

//		System.out.println("모든 경우의 수: ");
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				System.out.println(i + "+" + j + "=" + (i + j));
//			}
//		}

		System.out.println("합이 6이 되는 경우: ");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if ((i + j) == 6) {
					System.out.println("(" + i + "," + j + ")");
					count++;
				}
			}
		}
		System.out.println("총 " + count + "가지 ");
	}

}
