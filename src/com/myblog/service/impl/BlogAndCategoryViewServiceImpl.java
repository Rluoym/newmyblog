package com.myblog.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myblog.mapper.BlogAndCategoryViewMapper;
import com.myblog.po.BlogAndCategoryView;
import com.myblog.po.BlogAndCategoryViewExample;
import com.myblog.service.BlogAndCategoryViewService;

public class BlogAndCategoryViewServiceImpl implements BlogAndCategoryViewService {

	@Autowired BlogAndCategoryViewMapper viewMapper;
	@Override
	public BlogAndCategoryView selectBolgAndCategoryViewByBlogId(String blogId) throws Exception {
		// TODO Auto-generated method stub
		BlogAndCategoryViewExample condition=new BlogAndCategoryViewExample();
		BlogAndCategoryViewExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogIdEqualTo(blogId);
		BlogAndCategoryView blogAndCategoryView=viewMapper.selectByExample(condition).get(0);
		Date blogAddTime=blogAndCategoryView.getBlogCreatetime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String addTimeString=simpleDateFormat.format(blogAddTime);
		blogAndCategoryView.setBlogMemo(addTimeString);
		return blogAndCategoryView;
	}

	@Override
	public List<BlogAndCategoryView> selectBolgAndCategoryViewByCategoryId(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		BlogAndCategoryViewExample condition=new BlogAndCategoryViewExample();
		BlogAndCategoryViewExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogCategoryIdEqualTo(categoryId);
		return viewMapper.selectByExample(condition);
	}

}
