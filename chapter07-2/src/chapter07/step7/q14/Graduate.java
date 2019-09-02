package chapter07.step7.q14;

public class Graduate extends Student{
	private String type;
	private double scholarshipRate;
	
	public Graduate(String name, String major, int year, double gpa, String type, double sholarshipRate) {
		super(name, major, year, gpa);
		if(type == "교육조교" || type =="연구조교") this.type = type;
		else System.out.println("잘못된 입력");
		if(sholarshipRate >= 0.0 && sholarshipRate <= 1.0) this.scholarshipRate = scholarshipRate;
		else System.out.println("잘못된 입력 ");
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type == "교육조교" || type =="연구조교") this.type = type;
		else System.out.println("잘못된 입력");
	}
	public double getScholarshipRate() {
		return scholarshipRate;
	}
	public void setScholarshipRate( double sholarshipRate) {
		if(sholarshipRate >= 0.0 && sholarshipRate <= 1.0) this.scholarshipRate = scholarshipRate;
		else System.out.println("잘못된 입력 ");
	}
	
	@Override
	public String toString() {
		return "Gruduate [type=" + type + ", scholarshipRate=" + scholarshipRate + "]";
	}

}
