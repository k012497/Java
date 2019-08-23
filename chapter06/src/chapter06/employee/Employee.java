package chapter06.employee;

public class Employee {

	// 1 . 정적 /인스턴스 멤버 변수 선언
	private static int count = 0;
	private double salary;
	private String name;

	// 2. 생성자 오버로딩 (디폴트/매개변수)
	public Employee() {
		this(0.0, null);
	}

	public Employee(double salary, String name) {
		this.salary = salary;
		this.name = name;
		this.count++; // this로 해도 정적 멤버 영역에 접근한다!
	}

	// 3. 오버라이딩
	@Override
	protected void finalize() {
		System.out.println("잘 있으세요 .. 저는 메모리에서 사져요..");
		Employee.count--;
	}

	// 4. getters
	public static int getCount() {
		return count;
	}

}
