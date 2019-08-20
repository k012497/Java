package chapter03;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 0;

		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * (100 - 50 + 1) + 50);
			// 첫 글자 대문자(Math) >> 생성자함수가 아닌 클래스명으로 접근>>정적멤버함
			// 객체명으로도 접근 가능.
			
			if (num % 2 == 0)
				System.out.println(num + " : 짝수입니다.");
			else
				System.out.println(num + " : 홀수입니다. ");
		}

	}

}
