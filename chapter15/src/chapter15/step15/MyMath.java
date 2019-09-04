package chapter15.step15;

public class MyMath<T> {

	public static <T extends Number> double getAverage(T[] tArray) {
		double result = 0.0;
		for (int i = 0; i < tArray.length; i++) {
			result += Double.parseDouble(tArray[i]+""); //문자열을 더블로 바꿔줌 
		}
		result = result / tArray.length;
		return result;
	}
	
	public static void main(String[] args) {
		//배열은 auto boxing 안 됨... 
		Integer[] iArray = { 1, 2, 3, 4 };
		Float[] fArray = { 1.1f, 2.2f, 3.3f, 4.4f };
		Double[] dArray = { 1.1, 2.2, 3.3, 4.4 };
		
		System.out.println(getAverage(iArray));
		System.out.println(getAverage(fArray));
		System.out.println(getAverage(dArray));
	}
}
