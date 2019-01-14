package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Adm;
import java.util.List;

public interface AdmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adm record);

    Adm selectByPrimaryKey(Integer id);

    List<Adm> selectAll();

    int updateByPrimaryKey(Adm record);
}