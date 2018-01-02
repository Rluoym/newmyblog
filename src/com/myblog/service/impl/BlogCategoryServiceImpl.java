package com.myblog.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myblog.mapper.BlogCategoryMapper;
import com.myblog.mapper.BlogCategoryRelationshipMapper;
import com.myblog.mapper.BlogMapper;
import com.myblog.po.Blog;
import com.myblog.po.BlogAndCategoryViewExample;
import com.myblog.po.BlogCategory;
import com.myblog.po.BlogCategoryExample;
import com.myblog.po.BlogCategoryRelationshipExample;
import com.myblog.po.BlogCategoryRelationshipKey;
import com.myblog.po.BlogExample;
import com.myblog.service.BlogCategoryService;
import com.utils.GenerateRandomID;

public class BlogCategoryServiceImpl implements BlogCategoryService {

	
	@Autowired BlogCategoryMapper categoryMapper;
	@Autowired BlogCategoryRelationshipMapper blogCategoryRelationshipMapper;
	@Autowired BlogMapper blogMapper;
	
	@Override
	public BlogCategory addCategory(BlogCategory category) throws Exception {
		// TODO Auto-generated method stub
		//添加分类前，先判断是否有分类重名的
		
		BlogCategoryExample condition=new BlogCategoryExample();
		BlogCategoryExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogCategoryNameEqualTo(category.getBlogCategoryName());
		List<BlogCategory> listCategoryByName=categoryMapper.selectByExample(condition);
		if(listCategoryByName.isEmpty()){//为空则代表名字不重复
			category.setBlogCategoryId(GenerateRandomID.generateRandomID());
			category.setBlogCategoryCreatetime(new Date());
			int insertCount=categoryMapper.insert(category);
			return insertCount==0 ? null:category;
		}
		return null;
	}

	//删除分类，如果分类下还有博文，则应该先删除分类下的博文，还要删除relationship表中的记录
	@Override
	public void deleteCategory(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		categoryMapper.deleteByPrimaryKey(categoryId);
	}

	@Override
	public BlogCategory updateCategory(BlogCategory category) throws Exception {
		// TODO Auto-generated method stub
		category.setBlogCategoryUpdatetime(new Date());
		int updateCount=categoryMapper.updateByPrimaryKey(category);
		return updateCount==0 ? null:category;
	}

	@Override
	public void deleteCategories(String[] categoryIds) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<categoryIds.length;i++)
			categoryMapper.deleteByPrimaryKey(categoryIds[i]);
	}

	@Override
	public List<Blog> findBlogsByCategoryId(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		
		//要通过categoryId找到id对应下的所用blog，需要借助blog_category_relationship表。
		//先通过categoryId查找blog_category_relationship表得到对应的blogId
		//再通过blogId查找blog表
		List <Blog> blogLists=new ArrayList();
		BlogCategoryRelationshipExample condition=new BlogCategoryRelationshipExample();
		BlogCategoryRelationshipExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogCategoryIdEqualTo(categoryId);
		List<BlogCategoryRelationshipKey>  relationLists=blogCategoryRelationshipMapper.selectByExample(condition);
		for(int i=0;i<relationLists.size();i++){
			String blogId=relationLists.get(i).getBlogId();
			Blog blog=blogMapper.selectByPrimaryKey(blogId);
			blogLists.add(blog);
		}
		return blogLists.isEmpty() ? null : blogLists;
	}

	@Override
	public BlogCategory selectCategoryById(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		
		return categoryMapper.selectByPrimaryKey(categoryId);
	}

	@Override
	public List<BlogCategory> selectCategories() throws Exception {
		// TODO Auto-generated method stub
		return categoryMapper.selectByExample(null);
	}

	@Override
	public int countCategories() throws Exception {
		// TODO Auto-generated method stub
		int totalCategories=categoryMapper.selectByExample(null).size();
		return totalCategories;
	}

	@Override
	public int countBlogByCategoryId(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		BlogCategoryRelationshipExample condition=new BlogCategoryRelationshipExample();
		BlogCategoryRelationshipExample.Criteria criteria=condition.createCriteria();
		criteria.andBlogCategoryIdEqualTo(categoryId);
		List<BlogCategoryRelationshipKey>  relationLists=blogCategoryRelationshipMapper.selectByExample(condition);
		
		return relationLists.size();
	}

}
