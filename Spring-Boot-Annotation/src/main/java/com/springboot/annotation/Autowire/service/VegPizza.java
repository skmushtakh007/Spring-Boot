package com.springboot.annotation.Autowire.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza {
    public String getPizza(){
        return "veg pizza";
    }
}
