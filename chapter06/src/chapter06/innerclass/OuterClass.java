package chapter06.innerclass;

public class OuterClass {
	// 1. member variable
	private int value;
	private static int staticValue;

	// 2-1.  static inner class
	static class StaticClass {
		// variable, method, constructor
//		int staticValue =OuterClass.staticValue;  //멤버변수 자리는 타입을 꼭 적어야 함. 
		public StaticClass() {
//			value = 10; //인스턴스 멤버 변수는 사용 불가. 외부 클래스가 객체화 되기 전이니까. 
			staticValue = 20; // 함수 안에서만 ! 정적 멤버 변수는 사용 가능
		}

//		InnerClass ic = new InnerClass(); //인스턴스 내부 클래스 사용 불가 
		StaticClass2 sc = new StaticClass2(); // static내부클래스는 다른 내부클래스에서 객체화 가능 
		OuterClass oc = new OuterClass();
		InnerClass ic = oc.new InnerClass(); // 외부클래스가 객체화되면 인스턴스 내부 클래스 사용 가능 


		public void staticMyMethod() {
			staticValue = 10;
			System.out.println(staticValue);
		}
	}

	static class StaticClass2 {
	}
	
	// 2-2. non- static inner class
	class InnerClass {
		// variable, method, constructor
		public InnerClass() {
			value = 10; //인스턴스 멤버 변수 사용 가능 
			staticValue = 20;
			StaticClass staticClass = new StaticClass();
			InnerClass innerClass = new InnerClass();
		}

		public void innerMyMethod() {
			value = 30;
			staticValue = 40;
			System.out.printf("InnerClass value = %d, staticValue = %d", value, staticValue);
		}
	}

	class InnerClass2 {
	}

	// 3. constructor overloading
	public OuterClass() {
		this(0);
	}

	public OuterClass(int value) {
		this.value = value;
	}

}
