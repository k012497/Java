package chapter09.anonymous;

public class Atest {
	public static void main(String[] args) {
		B b = new A();
		b.turnOn();
//		System.out.println(b.testVariable); //오버라이딩된 함수만 가리킬 수 있다. 

		// 1. 임시객체로 표현
		B b1 = new B() {
			public int testVariable = 40;

			@Override
			public void turnOn() {
				System.out.println("print member variable : " + testVariable);
				System.out.println("b1 turn ON");
			}

		};

		b1.turnOn();

		B b2 = new B() {
			public int testVariable = 50;

			@Override
			public void turnOn() {
				System.out.println("print member variable : " + testVariable);
				System.out.println("b2 turn ON");
			}
		};
		b2.turnOn();

		// 2. 람다식으로 표현
		B b3 = () -> {
			System.out.println("b1 turn ON");
		};

		b3.turnOn();

	}
}
