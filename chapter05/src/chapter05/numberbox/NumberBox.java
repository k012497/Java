package chapter05.numberbox;

public class NumberBox {
	private int ivalue;
	private float fvalue;

	public NumberBox(int ivalue, float fvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
	}
	
	public void setIvalue(int ivalue) {
		this.ivalue = ivalue;
	}
	public void setFvalue(float fvalue) {
		this.fvalue = fvalue;
	}
	
	public int getIvalue() {
		return this.ivalue;
	}
	public float getFvalue() {
		return this.fvalue;
	}
	public float multiFunc() {
		return (this.ivalue * this.fvalue);
	}
	
	
	
}
