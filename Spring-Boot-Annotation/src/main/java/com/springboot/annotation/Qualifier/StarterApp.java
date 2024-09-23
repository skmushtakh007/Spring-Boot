package com.springboot.annotation.Qualifier;

import com.springboot.annotation.Qualifier.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
       PizzaController pizzacontroller = context.getBean(PizzaController.class);
        System.out.println(pizzacontroller.getPizza());
    }
}
