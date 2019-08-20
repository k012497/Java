package example;

public class TypeConversion {

	public static void main(String[] args) {
		int i = 0;
		double f =0.0;
		
		f = 5 / 4;
		System.out.println(f); //1.0
		
		f = (double) 5 / 4;
		System.out.println(f); //1.25
		
		i = (int) 1.3 / (int) 1.8;
		System.out.println(i);//1
	}

}
