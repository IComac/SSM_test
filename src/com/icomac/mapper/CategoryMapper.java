package com.icomac.mapper;

import java.util.List;

import com.icomac.pojo.Category;

/**
 * CategoryMapper
 * 
 * @author IComac
 * @date 2019-04-19
 */
public interface CategoryMapper {
	
	public int add(Category category);
	
	public void delete(int id);
	
	public Category get(int id);
	
	public int update(Category category);
	
	public List<Category> list();
	
	public int count();
}
