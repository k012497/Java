package chapter03;

public class Sum2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1 ; i <= 100 ; i++){
			sum = i * (i+1) / 2;
		}
		
		System.out.println(sum);
	}

}
