package chapter05;

public class ReverseString {
	private String str;

	ReverseString() {
		this.str = null;
	}

	ReverseString(String original) {
		this.str= original;
	}
	
	public void print() {
		for (int i = this.str.length(); i >0 ; i--) {
			System.out.print(this.str.charAt(i - 1));
		}
		System.out.println("");
	}
}
