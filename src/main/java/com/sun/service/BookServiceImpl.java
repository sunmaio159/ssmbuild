package com.sun.service;

import com.sun.dao.BookMapper;
import com.sun.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("BookServiceImpl")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    /*public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }*/

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
