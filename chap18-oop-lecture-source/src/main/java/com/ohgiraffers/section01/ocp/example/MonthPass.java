package com.ohgiraffers.section01.ocp.example;

/*
 * Pass를 구현한 또 하나의 클래스다. 내용은 MonthTicket과 같은 월 회원권이다.
 * 같은 use를 CountPass와 다르게 만든다.
 * */
public class MonthPass implements Pass {

    private String owner;

    public MonthPass(String owner) {
        this.owner = owner;
    }

    public boolean use(String where) {
        System.out.println(owner + " " + where + " 입장, 월 회원권");
        return true;
    }
}