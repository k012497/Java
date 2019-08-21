package chapter05.test;

public class StudentTest {

	public static void main(String[] args) {
		Student person1 = new Student();
		Student person2 = new Student("김소진", 1, "여자", 4.5);

		person1.setName("홍길동");
		person1.setStudentNo(2);
		person1.setSex("남자");
		person1.setRate(5);

		System.out.println(person1.getName() + " " + person1.getStudentNo() + " " + person1.getSex()+ " " +person1.getRate());

		System.out.println(person2.toString());

		person1.print();
		person2.print();

	}

}
