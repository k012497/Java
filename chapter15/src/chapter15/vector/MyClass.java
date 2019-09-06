package chapter15.vector;

public class MyClass {
	public int number;

	public MyClass(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "" + number;
	}
	
	public void thisToString(MyClass thisAddress) {
		System.out.println("부모 hashCode ="+super.hashCode());
		System.out.println("부모 ="+super.toString());
		System.out.println("부모 identity ="+System.identityHashCode(super.getClass()));
		System.out.println("자식 hashCode ="+super.hashCode());
		System.out.println("자식 ="+thisAddress);
		System.out.println("자식 identity ="+System.identityHashCode(thisAddress));
	}
		
}
