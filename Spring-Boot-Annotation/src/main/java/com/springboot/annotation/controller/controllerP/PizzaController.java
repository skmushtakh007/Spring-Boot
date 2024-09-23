package com.springboot.annotation.controller.controllerP;

import org.springframework.stereotype.Component;

//@Component
@Component("pizzaController")
public class PizzaController {
    public String getPizza(){
        return "Hot pizza";
    }
}
