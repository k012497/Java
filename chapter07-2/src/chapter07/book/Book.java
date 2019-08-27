package chapter07.book;

public class Book {
	private String title;
	private String isbn;
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}

}
