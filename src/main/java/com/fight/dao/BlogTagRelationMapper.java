package com.fight.dao;


import com.fight.entity.BlogTagRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogTagRelationMapper {


    int deleteByPrimaryKey(Long relationId);
    int deleteByBlogId(Long blogId);

    int insert(BlogTagRelation record);
    int insertSelective(BlogTagRelation record);
    int batchInsert(@Param("relationList") List<BlogTagRelation> blogTagRelationList);

    BlogTagRelation selectByPrimaryKey(Long relationId);
    BlogTagRelation selectByBlogIdAndTagId(@Param("blogId") Long blogId, @Param("tagId") Integer tagId);
    List<Long> selectDistinctTagIds(Integer[] tagIds);

    int updateByPrimaryKeySelective(BlogTagRelation record);
    int updateByPrimaryKey(BlogTagRelation record);


}
