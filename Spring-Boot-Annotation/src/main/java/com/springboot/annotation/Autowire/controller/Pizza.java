package com.springboot.annotation.Autowire.controller;

import com.springboot.annotation.Autowire.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza {
    private VegPizza vegpizza;
    @Autowired
    public Pizza(VegPizza vegpizza){
        this.vegpizza = vegpizza;
    }

    public  String getPizza(){
        return vegpizza.getPizza();
    }
}
