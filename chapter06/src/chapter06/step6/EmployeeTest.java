package chapter06.step6;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee person1= new Employee();
		person1.setName("Sojin Kim");
		person1.setPhoneNumber("010-9999-2222");
		person1.setSalary(100000000);

		System.out.println(person1.getName());
		System.out.println(person1.getPhoneNumber());
		System.out.println(person1.getSalary());
	}

}
