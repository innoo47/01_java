package com.ohgiraffers.section02.responsibility.example;

/* 상속을 쓰기 전: 강아지 클래스도 이름 필드와 getName을 직접 가진다. PlainCat과 소리만 다르다. */
public class PlainDog {

    private String name;

    public PlainDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return name + ": 멍멍";
    }
}