package com.fight.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogTagCount {

    private Integer tagId;

    private String tagName;

    private Integer tagCount;

}
