package chapter07.step7;

public class Magazine extends Book {
	private String publishDate;
	
	public Magazine(String title, int pages, String author, String publishDate) {
		super(title, pages, author);
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Magazine [publishDate=" + publishDate + ", Title=" + getTitle() + ", Pages=" + getPages()
				+ ", Author=" + getAuthor() + "]";
	}
	
	
}
