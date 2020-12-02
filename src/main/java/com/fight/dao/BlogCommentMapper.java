package com.fight.dao;


import com.fight.entity.BlogComment;

import java.util.List;
import java.util.Map;

public interface BlogCommentMapper {



    int insert(BlogComment record);
    int insertSelective(BlogComment record);


    BlogComment selectByPrimaryKey(Long commentId);
    List<BlogComment> findBlogCommentList(Map map);
    int getTotalBlogComments(Map map);
    int checkDone(Integer[] ids);


    int updateByPrimaryKeySelective(BlogComment record);
    int updateByPrimaryKey(BlogComment record);


    int deleteByPrimaryKey(Long commentId);
    int deleteBatch(Integer[] ids);

}
