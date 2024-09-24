package com.springboot.annotation.PostMapping.controller;
import com.springboot.annotation.PostMapping.services.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {
    @PostMapping(value = "/book" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getName());
        System.out.println(book.getDescription());
        return book;
    }
}

// Note: @RequestBody annotation will convert json data into java object.
