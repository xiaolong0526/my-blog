package com.fight.dao;


import com.fight.entity.Blog;
import com.fight.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BlogMapper {

    // 根据id删除博客
    int deleteByPrimaryKey(Long blogId);
    // 插入博客
    int insert(Blog record);
    //
    int insertSelective(Blog record);
    // 根据id查询博客
    Blog selectByPrimaryKey(Long blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);
    // 更新博客
    int updateByPrimaryKey(Blog record);
    // 分页查询博客
    List<Blog> findBlogList(PageQueryUtil pageUtil);

    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);

    int getTotalBlogs(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

    int getTotalBlogsByTagId(PageQueryUtil pageUtil);

    Blog selectBySubUrl(String subUrl);

    int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId, @Param("ids")Integer[] ids);
}
