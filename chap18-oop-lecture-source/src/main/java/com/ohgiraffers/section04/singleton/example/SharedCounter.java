package com.ohgiraffers.section04.singleton.example;

public class SharedCounter {

    private static SharedCounter instance = new SharedCounter();

    private int count;

    private SharedCounter() {
    }

    public static SharedCounter getInstance() {
        return instance;
    }

    public void increase() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}