package com.springboot.annotation.RequestMapping.controller;

import com.springboot.annotation.RequestMapping.service.ClassBook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WithClass {
    @RequestMapping("/hello")
    public String get(){
        return "Hello world";
    }
    @RequestMapping("/book")
    public ClassBook getBook(){
        ClassBook classBook = new ClassBook(1,"CPP","Basic language");
        return  classBook;
    }

    //for multiple URI
    @RequestMapping(value = {"/a","/b","/c"})     //for multiple URI
    public ClassBook Book(){
        ClassBook classBook = new ClassBook(2,"JavaScript","Used for fron end development");
        return classBook;
    }
}
