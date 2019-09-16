package chapter16.step16;

class A extends Thread {
	Test demo;

	public A(Test td) {
		demo = td;
	}

	public void run() {
		demo.sub();
	}
}