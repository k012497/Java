package chapter04;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		System.out.println(tv.getOnOff());
		
		//멤버 변수에 외부 접근 허용해서 값을 주는 것은 좋은 예가 아니다.
		tv.setChannel(20);
		tv.setVolume (40);
		tv.setOnOff(true);

		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		System.out.println(tv.getOnOff());
	}

}
