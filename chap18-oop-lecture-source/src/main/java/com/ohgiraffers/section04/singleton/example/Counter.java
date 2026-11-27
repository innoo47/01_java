package com.ohgiraffers.section04.singleton.example;

public class Counter {

    private int count;

    public void increase() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}