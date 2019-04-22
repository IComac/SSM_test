package com.icomac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icomac.pojo.Category;
import com.icomac.service.CategoryService;


/**
 * CategoryController
 * @author IComac
 * @date 2019-04-22
 */
//告诉spring mvc这是一个控制器
@Controller
@RequestMapping("")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory() {
		ModelAndView mav = new ModelAndView();
		List<Category> cs = categoryService.list();
		
		//放入转发参数
		mav.addObject("cs", cs);
		//放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
}
