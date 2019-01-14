package com.nfczh.ssm.dao;

import com.nfczh.ssm.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int insert(Orders record);

    List<Orders> selectAll();
}