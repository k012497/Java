package chapter09.compare_object_test;

public class Rectangle  implements Comparable {
	public int width;
	public int height;

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public int compareTo(Object obj) {
		Rectangle rec = null;
		int returnValue = 0;
		
		if(obj instanceof Rectangle) 
			rec = (Rectangle) obj;
		
		if(this.width > rec.width) returnValue = 1;
		else if(this.width < rec.width) returnValue = -1;
		else returnValue = 0;
		
		return returnValue;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
