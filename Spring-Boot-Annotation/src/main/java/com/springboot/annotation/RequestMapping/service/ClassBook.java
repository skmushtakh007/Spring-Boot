package com.springboot.annotation.RequestMapping.service;

public class ClassBook {
    private int id;
    private String title;
    private String description;

    public ClassBook(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
