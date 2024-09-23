package com.springboot.annotation.Lazy;

import com.springboot.annotation.Lazy.service.EagerLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class,args);

EagerLoader eagerLoader = context.getBean(EagerLoader.class);
        System.out.println(eagerLoader);
    }
}
