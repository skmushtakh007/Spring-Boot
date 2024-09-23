package com.springboot.annotation.Primary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "Non veg pizza";
    }
}
