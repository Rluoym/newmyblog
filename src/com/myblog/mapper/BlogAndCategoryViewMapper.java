package com.myblog.mapper;

import com.myblog.po.BlogAndCategoryView;
import com.myblog.po.BlogAndCategoryViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogAndCategoryViewMapper {
    long countByExample(BlogAndCategoryViewExample example);

    int deleteByExample(BlogAndCategoryViewExample example);

    int insert(BlogAndCategoryView record);

    int insertSelective(BlogAndCategoryView record);

    List<BlogAndCategoryView> selectByExample(BlogAndCategoryViewExample example);

    int updateByExampleSelective(@Param("record") BlogAndCategoryView record, @Param("example") BlogAndCategoryViewExample example);

    int updateByExample(@Param("record") BlogAndCategoryView record, @Param("example") BlogAndCategoryViewExample example);
}