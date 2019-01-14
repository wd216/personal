package com.nfczh.ssmdemo01.dao;

import com.nfczh.ssmdemo01.entity.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}