package com.fight.dao;


import com.fight.entity.BlogTag;
import com.fight.entity.BlogTagCount;
import com.fight.utils.PageQueryUtil;

import java.util.List;

public interface BlogTagMapper {

    int insert(BlogTag record);
    int insertSelective(BlogTag record);
    int batchInsertBlogTag(List<BlogTag> tagList);


    BlogTag selectByPrimaryKey(Integer tagId);
    BlogTag selectByTagName(String tagName);
    List<BlogTag> findTagList(PageQueryUtil pageUtil);
    List<BlogTagCount> getTagCount();
    int getTotalTags(PageQueryUtil pageUtil);


    int updateByPrimaryKeySelective(BlogTag record);
    int updateByPrimaryKey(BlogTag record);


    int deleteByPrimaryKey(Integer tagId);
    int deleteBatch(Integer[] ids);

}
