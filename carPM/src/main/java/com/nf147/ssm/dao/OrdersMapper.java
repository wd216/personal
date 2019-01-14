package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int insert(Orders record);

    List<Orders> selectAll();
}