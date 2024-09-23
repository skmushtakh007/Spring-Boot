package com.springboot.annotation.controllerAnnotation.controller;

import com.springboot.annotation.controllerAnnotation.service.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/hello-world")
    @ResponseBody             //
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/book")
    @ResponseBody
    public Book getBook(){
        Book book = new Book(1,"core java","Java latest version");
        return  book;
    }
}
