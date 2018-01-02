package com.myblog.service;

import java.util.List;

import com.myblog.po.Blog;
import com.myblog.po.BlogAndCategoryView;
import com.myblog.po.BlogCategory;

public interface BlogService {
	
	//添加博客
	Blog addBlog(Blog blog, BlogCategory category) throws Exception;
	
	//修改博客
	void updateBlog(Blog blog, BlogCategory category) throws Exception;
	
	//根据blogId，查找blog
	Blog selectBlogById(String blogId) throws Exception;
	
	//查找所有博客，用于在首页显示，应该实现分页,按照createtime排序
	List<BlogAndCategoryView> selectBlogsByCreatetime() throws Exception;
	
	//根据id删除博客
	void deleteBlogById(String blogId) throws Exception;
	
	//根据id批量删除博客
	void deleteBlogsByIds(String [] blogIds) throws Exception;
}
