package com.nfczh.ssm.dao;

import com.nfczh.ssm.entity.TNews;
import java.util.List;

public interface TNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TNews record);

    TNews selectByPrimaryKey(Integer id);

    List<TNews> selectAll();

    int updateByPrimaryKey(TNews record);
}