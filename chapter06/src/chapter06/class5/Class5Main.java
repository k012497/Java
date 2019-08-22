package chapter06.class5;

import chapter06.class6.B1;

public class Class5Main {
	public static void main(String[] args) {
		
		//같은 패키지 내 클래스를 객체화 
		A1 a1 = new A1();
		a1.pubNum = 10; //public 객체의 public 변수 
		a1.defNum = 10; //public 객체의 default 변수 
//		a1.priNum = 10; //private변수는 접근 불가 
		a1.protectedNum = 10; //protected변수 접근 가능 
		A2 a2 = new A2();
		a2.pubNum = 10; //default 객체의 public 변수 
//		a2.priNum = 10; //private변수는 접근 불가 
		a2.protectedNum = 10; //protected변수 접근 가능 
		 
		
		
		// 다른 패키지에 있는 클래스를 객체화 
		// 패키지를 import해야 가능 
		B1 b1 = new B1();
		b1.pubNum = 10; // public 객체의 public 변수 
//		b1.priNum = 10; // private변수는 접근 불가 
//		b1.protectedNum = 10; //protected변수 접근 불가. 상속이 되어야 쓸 수 있다.  
//		B2 b2 = new B2(); B2 클래스는 default이므로 import 불가능!
//		b2.pubNum = 10;
//		b2.priNum = 10;
	}
}
