package chapter07.step7;

public class Customer extends Person{
	private int customerNum;
	private int mileage;
	
	public Customer(int customerNum, int mileage) {
		this.customerNum = customerNum;
		this.mileage =mileage;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer [customerNum=" + customerNum + ", mileage=" + mileage + 
				", \n" + super.toString()+ "]";
	}


	
}
