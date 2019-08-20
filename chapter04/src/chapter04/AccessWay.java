package chapter04;

public class AccessWay {

	static int num = 0;

	AccessWay() {incrCnt();}

	void incrCnt() {
		System.out.println("HI"+num);
	}

}

class ClassVarAccess{
	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		AccessWay.num++;
	}
}
