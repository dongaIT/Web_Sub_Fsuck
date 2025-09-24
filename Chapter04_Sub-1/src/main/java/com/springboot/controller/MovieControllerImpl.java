package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.domain.Movie;
import com.springboot.service.MovieService;

@Controller
public class MovieControllerImpl {
@Autowired
private MovieService movieService;
@RequestMapping(value = "/Movies", method = RequestMethod.GET)
public String requestMovieList(Model model) {
List<Movie>list = movieService.getAllMovieList();
model.addAttribute("movieList",list);
return "books";
}
}
  