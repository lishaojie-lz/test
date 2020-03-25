package com.lsj.movie.domain;

import java.util.Arrays;

public class Movie {
	Integer id;
	String name;
	String author;
	String price;
	String datetime;
	String times;
	String type;
	String years;
	String area;
	Integer status;
	Integer[] ids;
	public Movie() {
		super();
	}
	
	public Movie(Integer id, String name, String author, String price,
			String datetime, String times, String type, String years,
			String area, Integer status, Integer[] ids) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.datetime = datetime;
		this.times = times;
		this.type = type;
		this.years = years;
		this.area = area;
		this.status = status;
		this.ids = ids;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", author=" + author
				+ ", price=" + price + ", datetime=" + datetime + ", times="
				+ times + ", type=" + type + ", years=" + years + ", area="
				+ area + ", status=" + status + ", ids=" + Arrays.toString(ids)
				+ "]";
	}
	
	
}
