package com.ohgiraffers.section02.responsibility.example;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return getName() + ": 야옹";
    }
}