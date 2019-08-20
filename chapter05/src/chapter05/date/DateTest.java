package chapter05.date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date(2020, 3, 20);
		
		System.out.print(date.getYear());
		System.out.print(date.getMonth());
		System.out.println(date.getDay());
		
		date.setYear(2019);
		date.setMonth(8);
		date.setDay(20);
		
		date.memberPrint();

	}

}
