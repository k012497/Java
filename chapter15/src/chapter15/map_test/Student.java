package chapter15.map_test;

public class Student implements Comparable<Student>{
	public int number;
	public String name;
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return this.name +" "+ this.number;
	}

	@Override
	public int compareTo(Student o) {
		if (this.number < o.number) return -1;
		else if (this.number > o.number) return 1;
		return 0;
	}
	
	
	

}
