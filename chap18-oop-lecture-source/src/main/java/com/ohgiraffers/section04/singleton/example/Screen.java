package com.ohgiraffers.section04.singleton.example;

public class Screen {

    private Counter counter;

    /* 쓸 카운터를 생성자로 받는다. 싱글톤을 직접 꺼내지 않는다. */
    public Screen(Counter counter) {
        this.counter = counter;
    }

    public void click() {
        counter.increase();
    }
}