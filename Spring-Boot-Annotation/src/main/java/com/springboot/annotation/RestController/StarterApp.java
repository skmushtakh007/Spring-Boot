package com.springboot.annotation.RestController;

import com.springboot.annotation.RequestMapping.controller.WithClass;
import com.springboot.annotation.RestController.controller.BookController;
import com.springboot.annotation.RestController.service.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
        BookController restController = context.getBean(BookController.class);
        System.out.println(restController.getBook());
    }
}
