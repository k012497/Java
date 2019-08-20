package chapter05;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("김소진", 1, 13);
		
		System.out.println(std1);
		System.out.println(std2.toString());
	

	}

}
