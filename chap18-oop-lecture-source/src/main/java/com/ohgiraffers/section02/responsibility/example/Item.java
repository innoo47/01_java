package com.ohgiraffers.section02.responsibility.example;

public class Item {

    private String name;
    private int stock;

    public Item(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void sell() {
        stock = stock - 1;
    }
}
