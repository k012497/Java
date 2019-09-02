package chapter09.step9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Q16 {

	public static void main(String[] args) {
		// 1.
		int i = (int) (Math.random() * 100 - 0 + 1);
		System.out.println(i);
		System.out.println();

		// 2.
		String str = new String("082-2-777-5566");
		StringTokenizer st = new StringTokenizer(str, "-");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println();
		}

		// 3.
		Calendar c1 = new GregorianCalendar();
		c1.add(Calendar.DATE, 0);
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷
		String today = dateForm.format(c1.getTime()); // String으로 저장
		System.out.println(today);
		System.out.println();

		// 4.
		Q16 q16 = new Q16();
		System.out.println(q16.getClass());
		System.out.println();

		// 5.
		for (int j = 0; j <= 90; j += 5) {
			double radian = (Math.PI * j /180.0);
			System.out.println(Math.sin(radian));
		}

	}

}
