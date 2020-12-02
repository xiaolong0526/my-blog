package com.fight.dao;


import com.fight.entity.BlogCategory;
import com.fight.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogCategoryMapper {

    // 插入
    int insert(BlogCategory record);
    int insertSelective(BlogCategory record);

    //查询
    BlogCategory selectByPrimaryKey(Integer categoryId);
    BlogCategory selectByCategoryName(String categoryName);
    List<BlogCategory> findCategoryList(PageQueryUtil pageUtil);
    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);
    int getTotalCategories(PageQueryUtil pageUtil);

    //删除
    int deleteByPrimaryKey(Integer categoryId);
    int deleteBatch(Integer[] ids);

    //更新
    int updateByPrimaryKeySelective(BlogCategory record);
    int updateByPrimaryKey(BlogCategory record);

}
