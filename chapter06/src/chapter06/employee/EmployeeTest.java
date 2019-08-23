package chapter06.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee(3_000_000, "김소진");
		e1 = new Employee(4_000_000, "김소진");
		e1 = new Employee(5_000_000, "김소진");
		
		System.out.println("현재 직원 수 " + Employee.getCount());

	}

}
