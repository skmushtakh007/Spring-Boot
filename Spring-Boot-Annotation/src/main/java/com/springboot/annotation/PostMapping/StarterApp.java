package com.springboot.annotation.PostMapping;

import com.springboot.annotation.PostMapping.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
//        BookController bookController = context.getBean(BookController.class);
//        System.out.println(bookController);
    }
}
