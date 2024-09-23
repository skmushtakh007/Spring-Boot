package com.springboot.annotation.controllerAnnotation;

import com.springboot.annotation.controllerAnnotation.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
        context.getBean(BookController.class);
    }
}
