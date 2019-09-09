package chapter15.step15;

public class Student {
	private String name;
	private String address;
	private String telephone;
	
	
	public Student(String name, String address, String telephone) {

		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", telephone=" + telephone + "]";
	}
	
	

}
