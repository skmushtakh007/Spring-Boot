package com.springboot.annotation.Value.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Default name")
    private String defaultName;



    @Value("${mail.host}")          //property key=${mail.host}
    private String host;
    @Value("${mail.email}")
    private String email;
    @Value("${password}")
    private String password;

    public String getJavaHome() {
        return javaHome;
    }

    public String getHomedir() {
        return homedir;
    }

    @Value("${java.home}")
    private String javaHome;
    @Value("${HOME}")
    private String homedir;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String getDefaultName(){
        return defaultName;
    }
}
