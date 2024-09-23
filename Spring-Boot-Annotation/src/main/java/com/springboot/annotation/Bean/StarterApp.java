package com.springboot.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
//        context.getBean();

        System.out.println();
    }
}
