package chapter15.map;

public class Student {
	public int number;
	public String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	

}
