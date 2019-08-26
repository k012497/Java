package chapter06.step6;

public class Employee {
	private String name;
	private String phoneNumber;
	private long salary;
	
	public Employee() {
		this(null, null, 0);
	}
	
	public Employee(String name, String phoneNumber, long salary) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}
