package chapter05;

public class IDvalidation {
	public static final String ID = "kimsojin";
	
	private String id;
	
	public IDvalidation() {
		this.id = null;
	}
	
	public IDvalidation(String id) {
		this.id = id;
	}
	
	public void validationCheck() {
		if(this.id.equals(ID)) {
			System.out.println("아이디가 일치 합니다 ");
		}else {
			System.out.println("아이디가 불일치합니다. ");	
		}
	}
}
