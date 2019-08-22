package calendar;


public class Calendar {
	private static final int[] MAX_DAYS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear (int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
			return true;
		} 
		return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}
		return MAX_DAYS[month - 1];
	}
	
	public void printCalender(int year, int month, int dayValue) {

		System.out.printf("              << %4d년  %3d월 >>  \n", year, month);
		System.out.println("\tS     M     T     W     T     F     S    ");
		System.out.println("===============================");
		
		// 시작 요일 설정  
		for (int i =dayValue ; i > 0; i--) {
			System.out.print("\t");
		} 
		
		// 끝나는 일 설정 
		int maxDay = getMaxDaysOfMonth(year, month);
		
		int startNum = dayValue+1;
		int endNum = maxDay + dayValue+1;
		int j = 1;
		for (int i = startNum; i < endNum; i++) {
			System.out.printf("\t%d", j);
			j++;
			if(i % 7 == 0) { //7개마다 개행 
				System.out.println();	
			}
		}
		System.out.println();	
			
	}

	public static void main(String[] args) {
	}
}
