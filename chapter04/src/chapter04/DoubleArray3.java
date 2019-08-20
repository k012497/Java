package chapter04;

public class DoubleArray3 {

	public static void main(String[] args) {
		double[] values = new double[10];
		init(values);
		for (int i = 0 ; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	public static void init(double[] values) {
		double number = 1.0;
		for (int i = 0; i < values.length; i++) {
			values[i] = number;
			number++;
		}
	}

}
