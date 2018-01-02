package com.myblog.service;

import java.util.List;

import com.myblog.po.BlogAndCategoryView;
import com.utils.PageUtil;

public interface PageService {
	//通过视图查找博客和博客分类两张表，分页查询
	List<BlogAndCategoryView> selectByPage(PageUtil page) throws Exception;
	
	//总页数
	int countPage(PageUtil page) throws Exception;
	
	//总的博文数
	int countAll() throws Exception;
}
