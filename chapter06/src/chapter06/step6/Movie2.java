package chapter06.step6;

public class Movie2 {
	private String title;
	private String director;
	private String prodCompany;
	
	public Movie2() {
		this(null, null, null);
	}
	
	public Movie2(String title, String director, String prodCompany) {
		this.title = title;
		this.director = director;
		this.prodCompany = prodCompany;
	}
}
