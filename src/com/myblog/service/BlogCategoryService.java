package com.myblog.service;

import java.util.List;

import com.myblog.po.Blog;
import com.myblog.po.BlogCategory;

public interface BlogCategoryService {
	//添加分类
	BlogCategory addCategory(BlogCategory category) throws Exception;
	
	//删除分类,根据categoryId单条删除
	void deleteCategory(String categoryId) throws Exception;
	
	//修改分类
	BlogCategory updateCategory(BlogCategory category) throws Exception;
	
	//删除分类，根据id批量删除
	void deleteCategories(String [] categoryIds) throws Exception;
	
	//查找分类下的所有博客
	List<Blog> findBlogsByCategoryId(String categoryId) throws Exception;
	
	//根据分类id，查找分类id下的其它信息
	BlogCategory selectCategoryById(String categoryId) throws Exception;
	
	//查看所有分类
	List<BlogCategory> selectCategories() throws Exception;
	
	//计算分类总数
	int countCategories() throws Exception;
	
	//根据categoryId计算该分类下的博文总数
	int countBlogByCategoryId(String categoryId) throws Exception;
	
}
