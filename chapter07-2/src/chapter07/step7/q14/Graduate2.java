package chapter07.step7.q14;

public class Graduate2 extends Student{
	private String assistantType;
	private double scholarshipRate;
	private static String[] defaultType = {"교육조교", "연구조교"};
	
	public Graduate2(String name, String major, int year, double gpa, String type, double sholarshipRate, String assistantType) {
		super(name, major, year, gpa);
		this.assistantType = "교육조교"; //조교 타입은 교육 조교가 디폴트 값이도록 설정
		int returnValue = 1;
		for (int i = 0; i < defaultType.length; i++) {
			returnValue = assistantType.compareTo(defaultType[i]);
			if(returnValue ==0 ) {
				this.assistantType = assistantType;
				break;
			}
		} //무한루프가 아니므로 0 또는 0이 아닌 값이 담겨 나오게 됨 
		
		if(sholarshipRate >= 0.0 && sholarshipRate <= 1.0) this.scholarshipRate = scholarshipRate;
		else System.out.println("잘못된 입력 ");
	}
	public String getType() {
		return assistantType;
	}
	public void setType(String type) {
		if(type == "교육조교" || type =="연구조교") this.assistantType = type;
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
		return "Gruduate [type=" + assistantType + ", scholarshipRate=" + scholarshipRate + "]";
	}

}
