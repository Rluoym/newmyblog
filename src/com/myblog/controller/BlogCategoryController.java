package com.myblog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myblog.po.Blog;
import com.myblog.po.BlogCategory;
import com.myblog.service.BlogCategoryService;

@Controller
@RequestMapping("/category")
public class BlogCategoryController {
	@Autowired BlogCategoryService blogCategoryService;
	
	
	//创建分类
	@RequestMapping(value="/addCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String addCategory(BlogCategory category, Model model, HttpSession session) throws Exception{
		category=blogCategoryService.addCategory(category);
		model.addAttribute("category", category);
		return "forward:/adminUI/blogCategory";
	}
	
	//删除分类
	@RequestMapping(value="/deleteCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteCategory(String blogCategoryId, Model model, HttpSession session) throws Exception{
		blogCategoryService.deleteCategory(blogCategoryId);
		
		return "forward:/adminUI/blogCategory";
	}
	
	//删除多个分类
	@RequestMapping(value="/deleteCategories", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteCategories(String [] categoryIds, Model model, HttpSession session) throws Exception{
		blogCategoryService.deleteCategories(categoryIds);
		
		return "forward:/adminUI/blogCategory";
	}
	
	//修改分类
	@RequestMapping(value="/updateCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String updateCategory(BlogCategory category, Model model, HttpSession session) throws Exception{
		BlogCategory oldCategory=blogCategoryService.selectCategoryById(category.getBlogCategoryId());
		category.setBlogCategoryCreatetime(oldCategory.getBlogCategoryCreatetime());
		category=blogCategoryService.updateCategory(category);
		model.addAttribute("category", category);
		return "forward:/adminUI/blogCategory";
	}
	
	//查找分类下的所有博客
	@RequestMapping(value="/selectBlogByCategory", method={RequestMethod.POST, RequestMethod.GET})
	public String selectBlogByCategory(String categoryId, Model model, HttpSession session) throws Exception{
		List<Blog> blogList=blogCategoryService.findBlogsByCategoryId(categoryId);
		
		model.addAttribute("blogList", blogList);
		return "forward:/jsp/user/test.jsp";
	}
}
