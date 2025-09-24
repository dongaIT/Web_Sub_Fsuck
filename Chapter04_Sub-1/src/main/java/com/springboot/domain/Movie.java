package com.springboot.domain;

import java.math.BigDecimal;

public class Movie {
	private String movieId;
	private String title;
	private String director;
	private String duration;
	public String getMovieId() {
		return movieId;
	}
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
