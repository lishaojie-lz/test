package com.lsj.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lsj.movie.domain.Movie;
import com.lsj.movie.service.MovieService;

@Controller
public class MovieController {

	@Resource
	private MovieService service;
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有
	 * @param model
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("selects")
	public String selects(Model model,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, 3);
		
		List<Movie> list = service.selects();
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		
		model.addAttribute("page", page);
		return "selects";
		
	}
	/**
	 * 
	 * @Title: selects 
	 * @Description:模糊查询
	 * @param model
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@ResponseBody
	@RequestMapping("select")
	public String select(Model model,Integer pageNum,Integer pageSize,Movie movie){
		PageHelper.startPage(pageNum, 3);
		
		List<Movie> list = service.select(movie.getAuthor(),movie.getName());
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		
		model.addAttribute("page", page);
		return "select";
		
	}
	/**
	 * 
	 * @Title: del 
	 * @Description: 批量删除
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	@ResponseBody
	@RequestMapping("del")
	public boolean del(Integer ids[]){
		return service.del(ids);
		
	}
}
