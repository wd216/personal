package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Book;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    Book selectByName(String bname);

    List<Book> selectAll();

    List<Book> selectByType(Integer bid);

    Book selectById(Integer id);

    int updateByPrimaryKey(Book record);
}