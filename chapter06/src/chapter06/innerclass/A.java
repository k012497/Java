package chapter06.innerclass;

public class A {
	//정적멤변/함수는 넣을 수 있지만 인스턴스 멤변수/함수는못 넣는다. 
	
	A.B b1 = new A.B();
	B b2 = new B(); // B가 속한 A클래스 속이므로 B로의 내부 접근. A붙이든 말든 상관없다   

	static class B { 
		B(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	class C {
		C() {}
		int field1;
		void method1() {}
		
	}
	
	

}
