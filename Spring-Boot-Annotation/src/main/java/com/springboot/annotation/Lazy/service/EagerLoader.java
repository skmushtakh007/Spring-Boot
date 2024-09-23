package com.springboot.annotation.Lazy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    private LazyLoader lazyLoader;
    @Autowired
    public EagerLoader(@Lazy LazyLoader lazyLoader){
        this.lazyLoader = lazyLoader;
    }
    public void performAction(){
        System.out.println("Eager Loader is doing something....");
        lazyLoader.performAction();
    }
}
