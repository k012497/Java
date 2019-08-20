package chapter03;

import java.time.LocalDateTime;
import java.time.Month;

public class TimerTeset {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(); // LocalDateTime의 객체를 주는 것.? 리턴값 확인
		Month month = localDateTime.getMonth();
		int hour = localDateTime.getHour();
		int day = localDateTime.getDayOfMonth();
		int year = localDateTime.getYear();
		int minute = localDateTime.getMinute();
		int second = localDateTime.getSecond();
		
		System.out.println(year  + day + hour);
	}

}
