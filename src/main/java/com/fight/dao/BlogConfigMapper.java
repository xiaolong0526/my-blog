package com.fight.dao;


import com.fight.entity.BlogConfig;

import java.util.List;

public interface BlogConfigMapper {

    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}
