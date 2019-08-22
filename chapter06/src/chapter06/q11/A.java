package chapter06.q11;

public class A {
	void sub() {
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		set(p);
		System.out.println(p.x + "," + p.y);
	}
	
	void set(Point p) {
		p.x = 30;
		p.y = 40;
	}
}
