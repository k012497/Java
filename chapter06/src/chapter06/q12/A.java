package chapter06.q12;

public class A {
	int s;
	
	void sub() {
		int x = 5;
		setDouble(x);
		System.out.println(x+" ");
		System.out.println(s);
	}
	
	void setDouble(int x) {
		x = x*2;
		s = x;
	}
}
