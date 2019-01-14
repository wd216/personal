package com.nfczh.ssm.dao;

import com.nfczh.ssm.entity.Address;
import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    Address selectByPrimaryKey(Integer id);

    List<Address> selectAll();

    int updateByPrimaryKey(Address record);
}