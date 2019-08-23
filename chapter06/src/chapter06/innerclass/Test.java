package chapter06.innerclass;

import chapter06.innerclass.A.B;

public class Test {

	public static void main(String[] args) {
		
		A.B b1 = new A.B();
		B b2 = new B();
		
		A a = new A();

		A.C c1 = a. new C();
//		C c2 = a. new C();
//		a.C c2 = a. new C(); //객체참조변수를 클래스 타입으로 받아야 한다. 

	}

}
