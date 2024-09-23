package com.springboot.annotation.controller;

import com.springboot.annotation.controller.controllerP.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class spring {

        public static void main(String[] args) {
//            ConfigurableApplicationContext context = SpringApplication.run(com.springboot.annotation.controller.spring.class, args);
            ConfigurableApplicationContext context = SpringApplication.run(spring.class, args);
            System.out.println(context);
//            PizzaController pizzaController = context.getBean(PizzaController.class);
//            System.out.println(pizzaController.getPizza());
            PizzaController pizzacontroller = (PizzaController) context.getBean("pizzaController");
            System.out.println(pizzacontroller.getPizza());
        }

}
