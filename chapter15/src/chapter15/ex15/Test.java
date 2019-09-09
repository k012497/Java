package chapter15.ex15;

import java.util.ArrayList;

public class Test{
	public static <T> void a(T t){
		System.out.println(t.getClass().getName());
	}

	public static void main(String[] args) {
		a(1.1);
		a(3);
		
		ArrayList<Double> array = new ArrayList();
		
		
	}
}
