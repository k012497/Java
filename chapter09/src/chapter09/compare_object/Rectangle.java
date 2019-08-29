package chapter09.compare_object;

public class Rectangle implements Comparable{
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return this.height * this.width;
	}
	
	@Override
//	public int compareTo(Object object) {
//		Rectangle rec = null; //지역변수니까 디폴트값 넣어주기!
//		
//		if (object instanceof Rectangle) {			
//			 rec = (Rectangle)object;
//			 if(this.getArea() == rec.getArea()) {
//				 return 0;
//			 } else if(this.getArea() > rec.getArea()) {
//				 return 1;
//			 }
//		}
//		return -1;
//	}
	
//교수님 코드
	public int compareTo (Object object) {
		Rectangle rectangle = null;
		int returnValue = 0; // return남발하지 않기 위해 
		
		if(object instanceof Rectangle) {
			rectangle = (Rectangle)object;
			if (this.getArea() > rectangle.getArea())
				returnValue = 1;
			else if (this.getArea() < rectangle.getArea())
				returnValue =  -1;
			else returnValue = 0;	
		} else {
			System.out.println("오류. 내 짝은 어디에 ?! ");
			System.exit(0);
		}
		
		return returnValue;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
