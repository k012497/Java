package chapter06.step6;

public class Movie {
	private String title, director, actors;
	
	public Movie(){
		this.title = null;
		this.director = null;
		this.actors = null;
	}
	
	public Movie(String title, String director, String actors){
		this.title = title;
		this.director = director;
		this.actors = actors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDirector() {
		return this.director;
	}

	public String getActors() {
		return this.actors;
	}
	
}
