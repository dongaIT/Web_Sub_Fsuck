package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.domain.Movie;
import com.springboot.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movierepository;
	public List<Movie> getAllMovieList(){
		return movierepository.getAllMovieList();
	} 
}
