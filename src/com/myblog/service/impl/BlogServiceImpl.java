package com.myblog.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myblog.mapper.BlogAndCategoryViewMapper;
import com.myblog.mapper.BlogCategoryMapper;
import com.myblog.mapper.BlogCategoryRelationshipMapper;
import com.myblog.mapper.BlogMapper;
import com.myblog.po.Blog;
import com.myblog.po.BlogAndCategoryView;
import com.myblog.po.BlogAndCategoryViewExample;
import com.myblog.po.BlogCategory;
import com.myblog.po.BlogCategoryRelationshipExample;
import com.myblog.po.BlogCategoryRelationshipKey;
import com.myblog.service.BlogService;
import com.utils.GenerateRandomID;
import com.myblog.service.impl.BlogAndCategoryViewServiceImpl;

public class BlogServiceImpl implements BlogService {

	@Autowired BlogMapper blogMapper;
	@Autowired BlogCategoryRelationshipMapper relationMapper;
	@Autowired BlogCategoryMapper categoryMapper;
	@Autowired BlogAndCategoryViewMapper viewMapper;
	
	//添加博客时，需要操作blog、blog_category_relationship两个表
	@Override
	public Blog addBlog(Blog blog, BlogCategory category) throws Exception {
		// TODO Auto-generated method stub
	
		blog.setBlogCreatetime(new Date());
		
		blog.setBlogId(GenerateRandomID.generateRandomID());
		BlogCategoryRelationshipKey relationship=new BlogCategoryRelationshipKey();
		relationship.setBlogCategoryId(category.getBlogCategoryId());
		relationship.setBlogId(blog.getBlogId());
		int addCount=blogMapper.insert(blog);
		relationMapper.insert(relationship);
		return addCount==0 ? null:blog;
	}

	//如果在更新博客时，更新了分类，那么需要在更新blog表前 先更新relationship表
	@Override
	public void updateBlog(Blog blog, BlogCategory category) throws Exception {
		// TODO Auto-generated method stub
		BlogCategoryRelationshipExample condition=new BlogCategoryRelationshipExample();
		BlogCategoryRelationshipKey updateValue=new BlogCategoryRelationshipKey();
		updateValue.setBlogCategoryId(category.getBlogCategoryId());
		updateValue.setBlogId(blog.getBlogId());
		BlogCategoryRelationshipExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogIdEqualTo(blog.getBlogId());
		relationMapper.updateByExample(updateValue, condition); //第一个参数出入要更新的值(这里要更新categoryId)，第二个参数传入条件，即where=?
		blog.setBlogUpdatetime(new Date());
		blogMapper.updateByPrimaryKey(blog);
	}

	@Override
	public Blog selectBlogById(String blogId) throws Exception {
		// TODO Auto-generated method stub
		return blogMapper.selectByPrimaryKey(blogId);
	}

	@Override
	public void deleteBlogById(String blogId) throws Exception {
		// TODO Auto-generated method stub
		//删除blog时，要同时删除blog_category_relationship对应的记录
		BlogCategoryRelationshipExample condition=new BlogCategoryRelationshipExample();
		BlogCategoryRelationshipExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogIdEqualTo(blogId);
		relationMapper.deleteByExample(condition);
		blogMapper.deleteByPrimaryKey(blogId);
	}

	@Override
	public void deleteBlogsByIds(String[] blogIds) throws Exception {
		// TODO Auto-generated method stub
		
		for(int i=0; i<blogIds.length; i++){
			BlogCategoryRelationshipExample condition=new BlogCategoryRelationshipExample();
			BlogCategoryRelationshipExample.Criteria criteria=condition.createCriteria();
			criteria.andBlogIdEqualTo(blogIds[i]);
			relationMapper.deleteByExample(condition);
			blogMapper.deleteByPrimaryKey(blogIds[i]);
		}
		
	}

	//按照创建时间排序。操作视图,还需要分页显示。
	/**
	 * @deprecated 废弃的方法
	 * @see /newmyblog/src/com/myblog/service/impl/PageServiceImpl.java
	 */
	@Override
	public List<BlogAndCategoryView> selectBlogsByCreatetime() throws Exception {
		// TODO Auto-generated method stub
		//BlogExample condition=new BlogExample();
		BlogAndCategoryViewExample condition=new BlogAndCategoryViewExample();
		condition.setOrderByClause("blog_createtime desc");
		List<BlogAndCategoryView> blogListByCreatetime=viewMapper.selectByExample(condition);
		
		for(int i=0;i<blogListByCreatetime.size();i++){
			Date blogAddTime=blogListByCreatetime.get(i).getBlogCreatetime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String addTimeString=simpleDateFormat.format(blogAddTime);
			blogListByCreatetime.get(i).setBlogMemo(addTimeString);
			
		}
		return blogListByCreatetime;
	}

}
