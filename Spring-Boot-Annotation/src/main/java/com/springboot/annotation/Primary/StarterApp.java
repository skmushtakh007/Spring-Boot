package com.springboot.annotation.Primary;

import com.springboot.annotation.Autowire.controller.Pizza;
import com.springboot.annotation.Primary.controller.PizzaController;
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
