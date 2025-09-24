package com.springboot.repository;

import java.util.List;

import com.springboot.domain.Movie;

public interface MovieRepository {
	List<Movie> getAllMovieList();
}
