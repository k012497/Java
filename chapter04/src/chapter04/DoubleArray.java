package chapter04;

public class DoubleArray {

	public static void main(String[] args) {
		double[] array = { 1.0, 2.0, 3.0, 4.0 };
		double sum = 0.0, max = 0.0;

		max = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
			if (max < array[i]) max = array[i];
		}

		System.out.println("\nSum of elements in array is " + sum + ", Maximum number is" + max);

	}

}
