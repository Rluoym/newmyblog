package com.myblog.mapper;

import com.myblog.po.BlogCategoryRelationshipExample;
import com.myblog.po.BlogCategoryRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCategoryRelationshipMapper {
    long countByExample(BlogCategoryRelationshipExample example);

    int deleteByExample(BlogCategoryRelationshipExample example);

    int deleteByPrimaryKey(BlogCategoryRelationshipKey key);

    int insert(BlogCategoryRelationshipKey record);

    int insertSelective(BlogCategoryRelationshipKey record);

    List<BlogCategoryRelationshipKey> selectByExample(BlogCategoryRelationshipExample example);

    int updateByExampleSelective(@Param("record") BlogCategoryRelationshipKey record, @Param("example") BlogCategoryRelationshipExample example);

    int updateByExample(@Param("record") BlogCategoryRelationshipKey record, @Param("example") BlogCategoryRelationshipExample example);
}