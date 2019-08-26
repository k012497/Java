package chapter06.step6;

public class Book {
	private String title;
	private String author;
	
	Book (){
		this.title = null;
		this.author = null;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
