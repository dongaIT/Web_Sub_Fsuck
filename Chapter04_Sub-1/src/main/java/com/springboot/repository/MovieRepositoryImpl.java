package com.springboot.repository;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.springboot.domain.Movie;

public class MovieRepositoryImpl implements MovieRepository {
	
	private List<Movie> listOfMovie = new ArrayList<Movie>();
	
	public MovieRepositoryImpl() {
		Movie movie1 = new Movie();
		movie1.setTitle("귀멸의 칼날 무한성");
		movie1.setDuration("155분");
		movie1.setMovieId("IXJ9304");
		movie1.setDirector("소토자키 하루오");
		
		Movie movie2 = new Movie();
		movie2.setTitle("F1 더 무비");
		movie2.setDirector("조셉 코센스키");
		movie2.setDuration("155분");
		movie2.setMovieId("IDA9305");
		
		Movie movie3 = new Movie();
		movie3.setTitle("대부 1");
		movie3.setDirector("프란시스 포드 코폴라");
		movie3.setDuration("175분");
		movie3.setMovieId("IDA9306");
		
		listOfMovie.add(movie1);
		listOfMovie.add(movie2);
		listOfMovie.add(movie3);
	}
	public List<Movie> getAllMovieList(){
		return listOfMovie;
	}
}
