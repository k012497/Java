package chapter05;

public class IDvalidationTest {

	public static void main(String[] args) {
		IDvalidation id1 = new IDvalidation();
		IDvalidation id2 = new IDvalidation("kimsojin");
		IDvalidation id3 = new IDvalidation("sojin");
		
		id2.validationCheck();
		id3.validationCheck();
	}
}
