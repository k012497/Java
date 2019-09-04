package chapter15.step15;

public class MyMath2<T> {
	// method
	public static <T> double getAverage(T[] t){//static으로 하면객체를 안 만들고도 쓸 수 있다.
	double sum = 0.0;
	for(int i = 0 ; i < t.length ; i++) {
		sum += Double.parseDouble(t[i]+"");
	}
	return sum/(double)t.length;}
}

