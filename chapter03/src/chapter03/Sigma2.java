package chapter03;

public class Sigma2 {

	public static void main(String[] args) {
		int result = 0;
		
		for (int i = 10; i <= 30 ; i++) {
			for (int j = 0; j <= 5; j++) {
				result = result + i * j;
			}
			
		}
		System.out.println(result);

	}

}
