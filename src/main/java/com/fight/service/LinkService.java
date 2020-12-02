package com.fight.service;


import com.fight.entity.BlogLink;
import com.fight.utils.PageQueryUtil;
import com.fight.utils.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 查询友链的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    /**
     * 返回友链页面所需的所有数据
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
