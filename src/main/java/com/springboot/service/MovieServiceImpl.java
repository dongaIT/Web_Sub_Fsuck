package com.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.domain.Movie;
import com.springboot.domain.Booking; // Booking 클래스 임포트
import com.springboot.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movierepository;
	
	@Override
	public List<Movie> getAllMovieList(){
		return movierepository.getAllMovieList();
	}
	
	@Override
	public void saveBooking(Booking booking) {
		movierepository.save(booking);
	}
}