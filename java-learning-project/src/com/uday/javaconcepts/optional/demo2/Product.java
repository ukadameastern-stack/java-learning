package com.uday.javaconcepts.optional.demo2;

import java.util.Optional;

public class Product {
    private int id;
    private String name;
    private boolean isExpired;
    public Product(int id, String name, boolean isExpired) {
        this.id = id;
        this.name = name;
        this.isExpired = isExpired;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
