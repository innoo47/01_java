package com.ohgiraffers.section01.ocp.example;

/* 카페라테 메뉴를 맡는 클래스다. 모양은 Americano와 같다. */
public class Latte implements Beverage {

    public String getName() {
        return "카페라테";
    }

    public int getPrice() {
        return 5000;
    }
}