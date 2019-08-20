package chapter05.numberbox2;

public class NumberBox {
	//1. 멤버 변수 
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;
	
	//2. 생성자 함수 
	public NumberBox() {
		ivalue = 0;
		fvalue = 0.0f;
		dvalue = 0.0;
		cvalue = 97;//0주면 널값  
	}
	
	public NumberBox(int ivalue, float fvalue, double dvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;
		this.cvalue = 97;
	}

	public NumberBox(int ivalue, float fvalue, double dvalue, char cvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;
		this.cvalue = cvalue;
	}

	//3.  인스턴스 멤버함수 오버로딩
	public float calculate(int ivalue, float fvalue) {
		this.ivalue += ivalue;
		this.fvalue += fvalue;
		return this.ivalue * this.fvalue;
	}
	
	public double calculate(int ivalue, float fvalue, double dvalue) {
		this.ivalue += ivalue;
		this.fvalue += fvalue;
		this.dvalue += dvalue;
		return this.ivalue + this.fvalue + this.dvalue;
	}

	@Override //이거 오버라이드니까 잘 점검해줘야 해! 컴파일러에게 알려주는 것
	public String toString() {
		return "NumberBox [ivalue=" + ivalue + ", fvalue=" + fvalue + ", dvalue=" + dvalue + ", cvalue=" + cvalue + "]";
	}
	
	//4. 인스턴스 toString()
		
	
}
