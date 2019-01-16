package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Orderitem;
import java.util.List;

public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderitem orderitem);

    Orderitem selectByPrimaryKey(Integer id);

    List<Orderitem> selectAll();

    int updateByPrimaryKey(Orderitem record);

    List<Orderitem> selectByCusId(Integer id);
}