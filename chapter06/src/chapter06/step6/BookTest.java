package chapter06.step6;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.setTitle("자전거 도둑");
		book1.setAuthor("김소진");
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
	}
}
