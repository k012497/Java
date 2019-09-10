package chapter16.join;

public class SumTest {

	public static void main(String[] args) {
		// 공유 객체생
		Data data = new Data();
		
		System.out.println(data.getSum());
		
		// GetSum 스레드 객체 생성 
		Thread thread = new GetSum(data);//?
		thread.start();
		
		try {
			thread.join(); // sum 클래스 스레드가 끝나면 main스레드가 작동된다. 
	} catch (InterruptedException e) {
	}
		System.out.println("1~100합계 = " + data.getSum());

	}

}
