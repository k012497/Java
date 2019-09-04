package chapter15.step15;

public class MyPair {
	public static void main(String[] args) {
		Pair<String> fruit = new Pair<String>("apple","grape");
		System.out.println(fruit.getT1());
		System.out.println(fruit.getT2());
	}
}
