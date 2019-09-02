package chapter06.arrayprocedure2;

public class ArrayProcTest {

	public static void main(String[] args) {
		ArrayProc score1 = new ArrayProc(10);
		score1.getValues();
		score1.printArray();
		System.out.println(score1.getSum());
		System.out.println(score1.getAverage());
		System.out.println(score1.getMax());
		System.out.println(score1.getMin());
		System.out.println(score1.toString());
		
//		System.out.println(score1.number1); //private static member는 접근불가. 
		System.out.println(score1.number2); //객체 참조변수로 부를 수 있다. 왜? 객체는 클래스번지를 받기 때문(그 클래스의 멤버들을 쓸 수 있음). 하지만 클래스명으로 접근할 수 있으니까 warning을 준다.  

	}

}
