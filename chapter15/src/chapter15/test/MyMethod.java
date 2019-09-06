package chapter15.test;

public class MyMethod {
	public static <T extends Comparable> T getMax(T[] t) {
		T max = t[0];
		if(t == null) return null;
		
		for (int i = 1; i < t.length; i++) {
			if(max.compareTo(t[i]) < 0) max = t[i];
		}

		return max;
		
	}

}
