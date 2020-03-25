package com.lsj.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lsj.movie.domain.Movie;

public interface MovieMapper {

	List<Movie> selects();

	List<Movie> select(@Param("author")String author, @Param("name")String name);

	boolean del(Integer[] ids);

}
