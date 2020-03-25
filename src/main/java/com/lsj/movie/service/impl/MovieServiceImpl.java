package com.lsj.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsj.movie.dao.MovieMapper;
import com.lsj.movie.domain.Movie;
import com.lsj.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieMapper mapper;

	@Override
	public List<Movie> selects() {
		// TODO Auto-generated method stub
		return mapper.selects();
	}

	@Override
	public List<Movie> select(String author, String name) {
		// TODO Auto-generated method stub
		return mapper.select(author,name);
	}

	@Override
	public boolean del(Integer[] ids) {
		// TODO Auto-generated method stub
		return mapper.del(ids);
	}


}
