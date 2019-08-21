package chapter05;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void print1() {
		System.out.println(this.year+"." + this.month + "." + this.day);
	}
	
	
	public void print2() {
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		//System.out.print(month[3]);
		for (int i = 0; i < month.length; i++) {
			if (this.month == i) {
				System.out.print(month[i-1]);
				break;
			}
		}
		System.out.println( " " + this.day + ", " + this.year);
	}

}
