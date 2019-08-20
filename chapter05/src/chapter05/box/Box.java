package chapter05.box;

public class Box {
	private int width;
	private int length;
	private int height;
	
	public Box(){
		this.width = 0;
		this.length = 0;
		this.height = 0;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public int getLength() {
		return this.length;
	}

}
