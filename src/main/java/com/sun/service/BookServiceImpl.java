package com.sun.service;

import com.sun.dao.BookMapper;
import com.sun.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int update(Books books) {
        return bookMapper.update(books);
    }

    public Books queryById(int id) {
        return bookMapper.queryById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
