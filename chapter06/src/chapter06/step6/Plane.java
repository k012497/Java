package chapter06.step6;

public class Plane {
	private String company;
	private String model;
	private int maxPassenger;
	private static int planes;
	
	public Plane() {
		this(null, null, 0); //이렇게 하면 매개변수 3개 받는 생성자 부르는 것!!
	}

	public Plane(String company, String model, int maxPassenger) {
		this.company = company;
		this.model = model;
		this.maxPassenger = maxPassenger;
		planes++;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxPassenger() {
		return maxPassenger;
	}

	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}

	public static int getPlanes() {
		return planes;
	}

	
	
	
}
