package com.springboot.annotation.Primary.controller;

import com.springboot.annotation.Primary.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
   private Pizza pizza;
   @Autowired
   public PizzaController(Pizza pizza){
       this.pizza=pizza;
   }

    public String getPizza(){
        return pizza.getPizza();
    }
}
