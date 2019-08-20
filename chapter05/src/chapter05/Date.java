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
		switch (this.month) {
		case 1:
			System.out.print("Jan");
			break;
		case 2:
			System.out.print("Feb");
			break;
		case 3:
			System.out.print("Mar");
			break;
		case 4:
			System.out.print("Apr");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("Jun");
			break;
		case 7:
			System.out.print("Jul");
			break;
		case 8:
			System.out.print("Aug");
			break;
		case 9:
			System.out.print("Sep");
			break;
		case 10:
			System.out.print("Oct");
			break;
		case 11:
			System.out.print("Nov");
			break;
		case 12:
			System.out.print("Dec");
			break;

		default:
			break;
		}
		System.out.println( " " + this.day + ", " + this.year);
	}

}
