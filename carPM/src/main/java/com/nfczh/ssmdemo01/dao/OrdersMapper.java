package com.nfczh.ssmdemo01.dao;

import com.nfczh.ssmdemo01.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int insert(Orders record);

    List<Orders> selectAll();
}