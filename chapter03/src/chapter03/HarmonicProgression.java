package chapter03;

public class HarmonicProgression {

	public static void main(String[] args) {
		double sum = 0 ;
		int n = 100;
		for (int i = 1; i < n; i++) {
			sum += (double)1/(double)i;
		}
		System.out.println(sum);
	}

}
