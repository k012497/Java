package chapter05;

public class Movie {
	private String title;
	private double rate;
	private String director;
	private int year;
	
	public Movie() {
		this.title = "";
		this.rate = 0.0;
		this.director = "";
		this.year = 0;
	}
	
	public Movie(String title, double rate, String director, int year) {
		this.title = title;
		this.rate = rate;
		this.director = director;
		this.year = year;
	}
	
	public void print() {
		System.out.println(year+"년작 "+director+"감독의 "+ title +" 평점: "+rate );
	}
}
