package chapter09.step9;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import chapter09.string_token.StringTest;

public class Q14 {

	public static void main(StringTest[] args) {
		// 1.
		int randomValue = (int) (Math.random() * 10 - 1 + 1) + 1;
		System.out.println(randomValue+"\n");

		// 2.
		StringTokenizer st1 = new StringTokenizer("By doubting we come at the truth");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println(st1+"\n");

		// 3.
		Calendar c1 = new GregorianCalendar();
		c1.add(Calendar.DATE, -1); // 오늘 날짜로부터 -1
		System.out.println();

		// 4.
		double[] darray = new double[] { 1.0, 3.0, 2.0 };
		Arrays.sort(darray);
		for (double d : darray) {
			System.out.println(d);
		}
		System.out.println();

		// 5.
		System.out.println(Integer.parseInt("1234")+"\n");

		// 6.
		T t = new T();
		System.out.println(t.getClass());
	}

}
