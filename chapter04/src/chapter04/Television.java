package chapter04;

public class Television {
	// 1. 멤버 변수
	private int channel;
	private int volume;
	private boolean onOff;

	// 2.생성자 함수
	public Television() {
		this.channel = 0;
		this.volume = 0;
		this.onOff = false;
	}

	// 3-1. 멤버 함수 (setters)
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	// 3-2. 멤버 함수 (getters) - 리턴값 생각하고 만들기 !
	public int getChannel() {
		return this.channel;
	}

	public int getVolume() {
		return this.volume;
	}

	public boolean getOnOff() {
		return this.onOff;
	}

}
