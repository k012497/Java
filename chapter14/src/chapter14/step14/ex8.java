package chapter14.step14;

public class ex8 {
	public static void throwit() {
		System.out.println("A");
		throw new RuntimeException(); //예외를 발생시켜 호출한 곳으로 던져 줌 
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("B");
			throwit(); 
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}

}
