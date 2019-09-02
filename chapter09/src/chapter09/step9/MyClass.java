package chapter09.step9;

public class MyClass extends C implements B{

	@Override
	public float mA(int a) {
		System.out.println("implement mA");
		return 0;
	}

	@Override
	public int mB(int a) {
		System.out.println("implement mB");
		return 0;
	}

	@Override
	public Object mBB(int a) {
		System.out.println("implement mBB");
		return null;
	}
	
}
