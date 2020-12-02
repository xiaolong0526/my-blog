package com.fight.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogTagRelation {
    private Long relationId;

    private Long blogId;

    private Integer tagId;

    private Date createTime;

}
