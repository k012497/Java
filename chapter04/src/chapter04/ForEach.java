package chapter04;

public class ForEach {
	//1. 멤버 변수
	private int[] numbers = new int[]{10, 20, 30 };
	
	//2. 생성자 함수
	public ForEach() { //매개변수가 없는 생성자함
		this.numbers = new int[]{10, 20, 30 };
	}
	public ForEach(int[] numbers) { //매개변수가 잇는 생성자 함
		this.numbers = numbers; //변수 충돌시 지역변수가 전역변수 이김  
	}
	//생성자 함수가 2개 ! 오버로딩.
	
	//3. 멤버 함수 
	public void generalFor() {
		for (int i = 0;i<numbers.length; i++) {
			System.out.print("\t"+numbers[i]);
		}
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public void improvedFor() {
		for(int number : numbers) {
			System.out.print("\t" + number);
		}
	}
}
