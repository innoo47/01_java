package com.ohgiraffers.section01.ocp.example;

/*
 * 아메리카노 메뉴를 맡는 클래스다.
 * 이름과 가격이 이 클래스 한 곳에 있다.
 * if 분기 구조에서는 같은 값이 priceOf 메소드 안에 있었다.
 * */
public class Americano implements Beverage {

    public String getName() {
        return "아메리카노";
    }

    public int getPrice() {
        return 4500;
    }
}