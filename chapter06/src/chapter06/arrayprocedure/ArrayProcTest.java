package chapter06.arrayprocedure;

public class ArrayProcTest {

	public static void main(String[] args) {
		ArrayProc arr1 = new ArrayProc(5, 0, 0.0);
		arr1.getValues();
		arr1.printArray();
		System.out.println("총합 : " +arr1.getSum());
		System.out.println("평균 : " +arr1.getAverage());

	}

}
