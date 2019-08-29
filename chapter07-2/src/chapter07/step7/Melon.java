package chapter07.step7;

public class Melon extends Food {
	private String farmInfo;
	
	public Melon(int kcal, int price, int g, String farmInfo) {
		super(kcal, price, g);
		this.farmInfo= farmInfo;
	}

	public String getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(String farmInfo) {
		this.farmInfo = farmInfo;
	}

	@Override
	public String toString() {
		return "Melon [farmInfo=" + farmInfo + ", Kcal=" + getKcal() + ", Price=" + getPrice() + ", G="
				+ getG() + "]";
	}
	
}
