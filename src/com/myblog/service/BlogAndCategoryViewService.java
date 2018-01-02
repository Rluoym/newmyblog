package com.myblog.service;

import java.util.List;

import com.myblog.po.BlogAndCategoryView;

public interface BlogAndCategoryViewService {
	//根据blogId，查询对应的博文、分类等信息
	BlogAndCategoryView selectBolgAndCategoryViewByBlogId(String blogId) throws Exception;
	
	//根据categoryId，查询分类下的所有博文
	List<BlogAndCategoryView> selectBolgAndCategoryViewByCategoryId(String categoryId) throws Exception;
}
