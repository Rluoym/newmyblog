package com.myblog.mapper.page;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myblog.po.BlogAndCategoryView;

public interface PageMapper {
	
	//计算总的记录数　　
	int countAll();
	
	//分页查询  mapper.xml文件中的参数读取@Param里面的值
	List<BlogAndCategoryView> selectByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
}
