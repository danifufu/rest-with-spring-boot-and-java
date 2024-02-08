package br.com.danifufu;

public class Greetings {

	// attributes
	private final long id;
	private final String content;
	
	// constructor
	public Greetings(long id, String content) {
		this.id = id;
		this.content = content;
	}

	// getters
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	} 
}
