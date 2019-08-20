package chapter04;

public class Histogram2 {
	public static final int COUNT = 10;

	public static void main(String[] args) {
		int[] countArr = new int[COUNT]; //객체 만들면 값 안 줘도 디폴트값이 들어간다. 
		int  randomNum  = 0;
		
		for (int i = 0; i < COUNT; i++) {
			randomNum = (int)(Math.random()*(100-1+1)+1);
			if(randomNum%10 == 0) {
				countArr[(randomNum/10)-1]++;
			}else {
				countArr[(randomNum/10)]++;
			}
			
		for (int j = 0; j < COUNT; j++) {
				System.out.printf("%d~%d = ");
		}
		}
	}
}
