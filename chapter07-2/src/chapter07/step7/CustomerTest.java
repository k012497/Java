package chapter07.step7;

public class CustomerTest {

	public static void main(String[] args) {
		Customer person1 = new Customer(1, 0);
		
		person1.setName("SOJIN");
		person1.setAddress("Seoul");
		person1.setPhoneNum("010-0000-0000");
		
		System.out.println(person1);
	}

}
