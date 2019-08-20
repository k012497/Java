package chapter03;

public class Pi {

	public static void main(String[] args) {
		double pi1 = 0.0, pi2 = 0.0;
		boolean flag = true;

		// flag 이용
		for (int i = 1; i < 100000; i += 2) {
			if (flag) {
				pi1 += 4.0 / (double) i;
				flag = !flag;
			} else {
				pi1 += - 4.0 / (double) i;
				flag = !flag;
			}
		}

		// -1의 거듭제곱 이용 (짝수 번째에 -곱해지도록.i가 2씩 커짐에 주의!)
		for (int i = 1; i < 100000; i += 2) {
			pi2 += Math.pow(-1, (i/2 + 2)) * (4.0 / (double) i);
		}

		System.out.println(pi1);
		System.out.println(pi2);

	}

}
