package chapter15.step15;

public class MyMath2Test {

	public static void main(String[] args) {
		Integer[] t = {10, 20, 30, 40, 50};
		//원래 new Integer(10), new Integer(20) ...이런 식으로 줘야 한다 
		double avg = MyMath.<Integer>getAverage(t);
		System.out.println(avg);
		
		Double[] t2 = {10.0, 20.0, 30.0, 40.0};
		double avg2 = MyMath.<Integer>getAverage(t);
		System.out.println(avg2);
		
	}
}
