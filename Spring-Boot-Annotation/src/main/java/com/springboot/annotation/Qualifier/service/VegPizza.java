package com.springboot.annotation.Qualifier.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza {
@Override
    public String getPizza(){
    return "veg pizza";
}
}
