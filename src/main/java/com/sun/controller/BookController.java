package com.sun.controller;

import com.sun.pojo.Books;
import com.sun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdatePaper(@PathVariable("id") int id,Model model){
        Books books = new Books();
        books = bookService.queryById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }

    @RequestMapping("/updateBooks")
    public String updateBooks(Books books){
        bookService.update(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBooks(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
