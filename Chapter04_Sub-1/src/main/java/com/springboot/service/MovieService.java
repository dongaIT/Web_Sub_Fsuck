package com.springboot.service;

import java.util.List;

import com.springboot.domain.Movie;
import com.springboot.repository.MovieRepository;

public interface MovieService {
	List<Movie> getAllMovieList();
}

