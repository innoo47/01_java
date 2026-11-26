package com.ohgiraffers.section01.ocp.example;

/*
 * 새 메뉴 녹차를 맡는 클래스다.
 * 기존 파일을 고치지 않고 Beverage를 구현한 이 파일 하나를 새로 만들었다.
 * */
public class GreenTea implements Beverage {

    public String getName() {
        return "녹차";
    }

    public int getPrice() {
        return 3500;
    }
}