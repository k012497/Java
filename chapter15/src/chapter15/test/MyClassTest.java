package chapter15.test;

public class MyClassTest{

	public static void main(String[] args) {
		MyClass[] mc = { new MyClass<MyClass>(10, "aaa"), new MyClass<MyClass>(50, "bbb"),
				new MyClass<MyClass>(30, "ccc") };

		for (int i = 0; i < mc.length; i++) {
			System.out.println(mc[i].toString());
		}

		System.out.println("가장 큰 객체는 " + MyMethod.getMax(mc));
	}

}
