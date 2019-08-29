package chapter07.step7;

public class Food {
	private int kcal;
	private int price;
	private int g;
	
	public Food(int kcal, int price, int g) {
		super();
		this.kcal = kcal;
		this.price = price;
		this.g = g;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}

}
