package com.fight.service;


import com.fight.entity.BlogCategory;
import com.fight.utils.PageQueryUtil;
import com.fight.utils.PageResult;

import java.util.List;

public interface CategoryService {


    int getTotalCategories();

    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();

    /**
     * 添加分类数据
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName,String categoryIcon);

    /**
     * 查询分类的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);
}
