package com.springboot.service;

import java.util.List;
import com.springboot.domain.Movie;
import com.springboot.domain.Booking; // Booking 클래스 임포트

public interface MovieService {
	List<Movie> getAllMovieList();
	
	// Booking 저장
	void saveBooking(Booking booking);
}