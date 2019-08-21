package chapter05.test;

public class Student2 {

	private String name;
	private int score;
	private String gender;

	// 생성자 함수
	public Student2() {
		this.name = null;
		this.score = 0;
		this.gender = null;
	}
	
	public Student2(String name, int score, String gender) {
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	//getters, setters
	public String getName() {
		return this.name;
	}

	public void setScore(int score) { 

		if (score >= 0 && score <= 100) { //값을 점검함 
			this.score = score;
		} else {
			System.out.println("점수를 잘못 입력하셨습니다. 0점이 입력됩니다 ");
			this.score = 0;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}
	
	//사용자 정의 함수

}
