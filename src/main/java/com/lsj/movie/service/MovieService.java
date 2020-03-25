package com.lsj.movie.service;

import java.util.List;

import com.lsj.movie.domain.Movie;

public interface MovieService {

	List<Movie> selects();

	List<Movie> select(String author, String name);

	boolean del(Integer[] ids);

}
