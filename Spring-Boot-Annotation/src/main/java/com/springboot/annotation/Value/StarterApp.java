package com.springboot.annotation.Value;

import com.springboot.annotation.Value.controller.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class StarterApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApp.class,args);
        ValueAnnotation valueAnnotation= context.getBean(ValueAnnotation.class);
        System.out.println(valueAnnotation.getDefaultName());
        System.out.println(valueAnnotation.getHost());
        System.out.println(valueAnnotation.getEmail());
        System.out.println(valueAnnotation.getPassword());
        System.out.println(valueAnnotation.getJavaHome());
        System.out.println(valueAnnotation.getHomedir());
    }
}
