package com.fight.service;


import com.fight.entity.BlogTagCount;
import com.fight.utils.PageQueryUtil;
import com.fight.utils.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
