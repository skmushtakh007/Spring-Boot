package com.springboot.annotation.RestController.controller;

import com.springboot.annotation.RestController.service.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping("/book")
    public Book getBook() {
        Book book = new Book(1,"Python","Lets Understand python");
        return book;
    }
}
