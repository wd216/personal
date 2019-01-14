package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Booktype;
import java.util.List;

public interface BooktypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Booktype record);

    Booktype selectByPrimaryKey(Integer id);

    List<Booktype> selectAll();

    int updateByPrimaryKey(Booktype record);
}