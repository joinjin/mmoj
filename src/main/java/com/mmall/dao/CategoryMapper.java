package com.mmall.dao;

import com.mmall.pojo.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}