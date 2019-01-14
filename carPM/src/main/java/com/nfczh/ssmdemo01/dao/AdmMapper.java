package com.nfczh.ssmdemo01.dao;

import com.nfczh.ssmdemo01.entity.Adm;
import java.util.List;

public interface AdmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adm record);

    Adm selectByPrimaryKey(Integer id);

    List<Adm> selectAll();

    int updateByPrimaryKey(Adm record);
}