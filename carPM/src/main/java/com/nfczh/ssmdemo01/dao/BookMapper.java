package com.nfczh.ssmdemo01.dao;

import com.nfczh.ssmdemo01.entity.Book;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}