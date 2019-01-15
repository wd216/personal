package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    Customer selectByNameAndPwd(Customer record);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}