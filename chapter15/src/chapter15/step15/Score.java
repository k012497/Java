package chapter15.step15;

import java.util.ArrayList;
import java.util.List;

public class Score {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();

		double max = 0.0;
		double min = 10.0;
		double sum = 0.0;

		for (int i = 0; i < SIZE; i++) {
			list.add(i, (Math.random() * 11));

			if (max < list.get(i))
				max = list.get(i);
			else if (min > list.get(i))
				min = list.get(i);

			sum += list.get(i);
		}

		sum -= (max + min);
		System.out.println("최저 최고 점수를 제외한 점수 합 : " + sum);

	}

}
