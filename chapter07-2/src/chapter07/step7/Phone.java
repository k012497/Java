package chapter07.step7;

public class Phone {
	private String productionCompany;
	private String dataType;
	private long price;
	
	public Phone(String productionCompany, String dataType, long price) {
		super();
		this.productionCompany = productionCompany;
		this.dataType = dataType;
		this.price = price;
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	

}
