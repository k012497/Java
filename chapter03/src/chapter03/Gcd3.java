package chapter03;

public class Gcd3 {

	public static void main(String[] args) {
		int num1 = 48, num2 = 60;
		int x = 0, y = 0;
		int gcd = 0;
		
		if (num1 > num2) {
			x = num1;
			y = num2;
		}
		else {
			x = num2;
			y = num1;
		}
		
		for(int i = 1 ; i <= num2 ; i++) {
			if (num1 % i == 0 && num2 % i == 0) gcd = i;
		}
		
		System.out.println(gcd);
	}

}
