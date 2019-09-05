package chapter15.comparable;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass<MyClass> mc1 = new MyClass<>(10, "sojin");
		MyClass<MyClass> mc2 = new MyClass<>(20, "kim");

		int result = mc1.compareTo(mc2);
		
		switch (result) {
		case 1:
			System.out.println("mc1이 큽니다. " + mc1);
			break;
		case -1:
			System.out.println("mc2가 큽니다. " + mc2);
			break;
		case 0:
			System.out.println("같습니다.");
			break;

		default: System.out.println("정신 차려 "); break;
		}
		
		MyClass[] mcArray = {new MyClass<MyClass>(10, "홍길동"),
		 	new MyClass<MyClass>(20, "저길동 "),
		 	new MyClass<MyClass>(30, "그길동 "),
		 	new MyClass<MyClass>(40, "이길동 "),
		 	new MyClass<MyClass>(50, "김길동 ")
		 	};
		MyClass largestObj = MyArrayAlg.getMax(mcArray);
		System.out.println(largestObj + "가 가장 큰 객체입니다. ");
		
		String[] strArray = {new String("lee"),new String("kim"),new String("park")};
		String largestStr = MyArrayAlg.getMax(strArray);
		System.out.println(largestStr + "가 가장 큰 객체입니다. ");
	}

}
