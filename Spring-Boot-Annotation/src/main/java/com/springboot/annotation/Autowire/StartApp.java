package com.springboot.annotation.Autowire;

import com.springboot.annotation.Autowire.controller.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(StartApp.class);
        Pizza pizza=context.getBean(Pizza.class);
        System.out.println(pizza.getPizza());
    }
}
