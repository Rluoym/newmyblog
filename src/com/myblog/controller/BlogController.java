package com.myblog.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myblog.po.Blog;
import com.myblog.po.BlogCategory;
import com.myblog.service.BlogAndCategoryViewService;
import com.myblog.service.BlogCategoryService;
import com.myblog.service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired BlogService blogService;
	@Autowired BlogCategoryService categoryService;
	@Autowired BlogAndCategoryViewService viewService;
	
	//添加博客
	@RequestMapping(value="/addBlog", method={RequestMethod.POST, RequestMethod.GET})
	public String addBlog(Blog blog, BlogCategory category, Model model, String content1) throws Exception{
		blog.setBlogContent(content1);
		blogService.addBlog(blog, category);
		model.addAttribute("blog", blog);
		return "forward:/adminUI/blog";
	}
	
	//修改博客
	@RequestMapping(value="/updateBlog", method={RequestMethod.POST, RequestMethod.GET})
	public String updateBlog(Blog blog, BlogCategory category, Model model, HttpSession session,String content1) throws Exception{
		blog.setBlogContent(content1);
		blog.setBlogUpdatetime(new Date());
		blogService.updateBlog(blog, category);
		
		return "forward:/adminUI/blog";
	}
	
	//删除博客
	@RequestMapping(value="/deleteBlogById", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteBlogById(String blogId, Model model, HttpSession session) throws Exception{
		
		blogService.deleteBlogById(blogId);
		
		return "forward:/adminUI/blog";
	}
	
	//批量删除博客
	@RequestMapping(value="/deleteBlogsByIds", method={RequestMethod.POST, RequestMethod.GET})
	public String deleteBlogsByIds(String [] blogIds, Model model, HttpSession session) throws Exception{
		blogService.deleteBlogsByIds(blogIds);
		return "forward:/adminUI/blog";
	}
}
