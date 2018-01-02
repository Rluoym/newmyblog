package com.myblog.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myblog.mapper.page.PageMapper;
import com.myblog.po.BlogAndCategoryView;
import com.myblog.service.PageService;
import com.utils.PageUtil;

public class PageServiceImpl implements PageService {

	@Autowired PageMapper pageMapper;
	
	@Override
	public List<BlogAndCategoryView> selectByPage(PageUtil page) throws Exception {
		// TODO Auto-generated method stub
		int currentPage=page.getCurrentPage();
		int pageSize=page.getPageSize();
		int startPos=(currentPage-1)*pageSize;
		List<BlogAndCategoryView> list= pageMapper.selectByPage(startPos, pageSize);
		for(int i=0;i<list.size();i++){
			Date blogAddTime=list.get(i).getBlogCreatetime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String addTimeString=simpleDateFormat.format(blogAddTime);
			list.get(i).setBlogMemo(addTimeString);
			
		}
		return list;
	}

	@Override
	public int countPage(PageUtil page) throws Exception {
		// TODO Auto-generated method stub
		int totalCount=this.countAll();
		int countPage=totalCount/page.getPageSize();
		
		if(totalCount%page.getPageSize() == 0){
			return countPage;
		}else{
			return countPage+1;
		}
	}

	@Override
	public int countAll() throws Exception {
		// TODO Auto-generated method stub
		return pageMapper.countAll();
	}

}
