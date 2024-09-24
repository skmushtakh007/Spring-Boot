package com.springboot.annotation.RequestMapping;

import com.springboot.annotation.RequestMapping.controller.WithClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class);
        WithClass withClass = context.getBean(WithClass.class);
        System.out.println(withClass.get());
        System.out.println(withClass.getBook());
    }
}
