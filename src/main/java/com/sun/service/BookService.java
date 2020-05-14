package com.sun.service;

import com.sun.pojo.Books;

import java.util.List;

public interface BookService {
    //增加 一本书
    int addBooks(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int update(Books books);
    //查询一本书
    Books queryById(int id);
    //查询全部的书
    List<Books> queryAllBook();
}
