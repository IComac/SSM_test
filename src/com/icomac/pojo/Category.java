package com.icomac.pojo;

/**
 * Category
 * 
 * @author IComac
 * @date 2019-04-19
 */
public class Category {
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
}
