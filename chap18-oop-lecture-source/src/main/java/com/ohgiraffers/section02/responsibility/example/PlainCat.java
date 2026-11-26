package com.ohgiraffers.section02.responsibility.example;

/* 상속을 쓰기 전: 고양이 클래스가 이름 필드와 getName을 직접 가진다. */
public class PlainCat {

    private String name;

    public PlainCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return name + ": 야옹";
    }
}