package com.icomac.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icomac.mapper.CategoryMapper;
import com.icomac.pojo.Category;
import com.icomac.service.CategoryService;

/**
 * CategoryServiceImpl
 * 
 * @author IComac
 * @date 2019-04-22
 */
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryMapper categoryMapper;
	
	public List<Category> list(){
		return categoryMapper.list();
	}
}
