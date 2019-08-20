package chapter05;

public class Dog {
	private String breed;
	private int age;
	private String color;
	
	public Dog() {
		this.breed = "";
		this.age = 0;
		this.color = "";
	}
	
	public Dog(String breed, int age, String color) {
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public void barking() {
		System.out.println(this.age +"살 " +this.breed + "종 " + this.color + "색 쿠키가 짖습니다 알알 ");
	}
	public void hungry() {
		System.out.println(this.age +"살 " +this.breed + "종 " + this.color + "색 쿠키가 배가 고파 꼬르륵 ");
	}
	public void sleeping() {
		System.out.println(this.age +"살 " +this.breed + "종 " + this.color + "색 쿠키가 잡니다 zZzZzZ ");
	}
	

}
