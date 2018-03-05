package com.mmall.dao;

import com.mmall.pojo.OrderIitem;

public interface OrderIitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderIitem record);

    int insertSelective(OrderIitem record);

    int updateByPrimaryKeySelective(OrderIitem record);

    int updateByPrimaryKey(OrderIitem record);
}