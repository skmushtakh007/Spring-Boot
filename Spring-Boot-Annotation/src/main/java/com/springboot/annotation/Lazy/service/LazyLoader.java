package com.springboot.annotation.Lazy.service;

import org.springframework.stereotype.Component;

@Component
public class LazyLoader {
    public LazyLoader(){
        System.out.println("Lazy Loader");
    }
    public  void performAction(){
        System.out.println("Lazy loader is doing something...");
    }
}
