package com.ohgiraffers.section02.responsibility.example;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return name + ": (소리 없음)";
    }
}