package com.sun.dao;

import com.sun.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加 一本书
    int addBooks(Books books);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //更新一本书
    int update(Books books);
    //查询一本书
    Books queryById(@Param("bookID") int id);
    //查询全部的书
    List<Books> queryAllBook();
}
