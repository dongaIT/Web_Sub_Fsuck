package com.springboot.repository;

import java.util.List;
import com.springboot.domain.Movie;
import com.springboot.domain.Booking; 

public interface MovieRepository {
	List<Movie> getAllMovieList();
	
	// Booking 객체 저장 메서드
	void save(Booking booking);
}