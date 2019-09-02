package chapter09.anonymous;

public class A implements B {
	public int testVariable = 19;
	
	@Override
	public void turnOn() {
		System.out.println("print member variable : "+testVariable);
		System.out.println("turn on");
	}

}
