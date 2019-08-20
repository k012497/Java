package chapter03;

public class ToBinary {
	static int count = 1;

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			// 1. 랜덤으로 숫자 50~150 10개 받기
			String strValue = toBinaryString(randomValue());
			print(strValue);
		}

	}

	public static int randomValue() {
		int num = 0;
		num = (int) (Math.random() * (150 - 50 + 1) + 50);

		return num;
	}

	public static String toBinaryString(int num) {
		String strValue = Integer.toBinaryString(num);
		while (strValue.length() < 16)
			strValue = "0" + strValue;

		return strValue;
	}

	public static void print(String str) {

		System.out.println(count + "번 " + randomValue() + ": " + str);
		count++;
	}

}
