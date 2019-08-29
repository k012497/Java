package chapter07.step7.q14;

public class UnderGraduate extends Student{
	private String clubName;

	public UnderGraduate(String name, String major, int year, double gpa, String clubName) {
		super(name, major, year, gpa);
		this.clubName = clubName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	

	@Override
	public String toString() {
		return "UnderGraduate [clubName=" + clubName + "]";
	}
	
	

}
