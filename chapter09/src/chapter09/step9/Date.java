package chapter09.step9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import chapter09.string_token.StringTest;

public class Date {

	public static void main(StringTest[] args) {
		Calendar c1 = new GregorianCalendar();
		Calendar c2 = new GregorianCalendar();

		c1.add(Calendar.DATE, -1); // 오늘 날짜로부터 -1
		c2.add(Calendar.DATE, 0); // 오늘 날짜
	
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 포맷
		String yesterday = dateForm.format(c1.getTime()); // String으로 저장
		String today = dateForm.format(c2.getTime());
		
		System.out.println(yesterday);
		System.out.println(today);

	}

}
