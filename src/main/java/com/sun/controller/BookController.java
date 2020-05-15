package com.sun.controller;

import com.sun.pojo.Books;
import com.sun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String allBook(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    @RequestMapping("/AddBook")
    public String AddBook(Books book){
        System.out.println(book);
        bookService.addBooks(book);
        return "redirect:/book/allBook";
    }
}
