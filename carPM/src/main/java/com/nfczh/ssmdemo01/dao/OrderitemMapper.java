package com.nfczh.ssmdemo01.dao;

import com.nfczh.ssmdemo01.entity.Orderitem;
import java.util.List;

public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderitem record);

    Orderitem selectByPrimaryKey(Integer id);

    List<Orderitem> selectAll();

    int updateByPrimaryKey(Orderitem record);
}