package chapter15.comparable;

public class MyClass<T extends MyClass> implements Comparable<T> {
	public int num;
	private String name;

	public MyClass(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int compareTo(T t) {
		MyClass mc = null;

		if (t instanceof MyClass) {
			mc = (MyClass) t;
		}

		if (this.num < mc.num) {
			return -1;
		} else if (this.num > mc.num) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "MyClass [num=" + num + ", name=" + name + "]";
	}
	
}
