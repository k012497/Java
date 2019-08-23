package chapter06.step6;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	public Dog() {
		this(null, null, 0);
	}
	public Dog(String name, int age) {
		this.name = name;
		this.breed = null;
		this.age = age;
	}
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
}
