package com.ohgiraffers.section01.ocp.example;

/*
 * 한 달 동안 횟수 제한 없이 들어오는 월 회원권이다.
 * 새 요구사항으로 생긴 회원권이며, Ticket과 같은 일(입장)을 다르게 한다.
 * 아직 Ticket과 이어 주는 타입이 없다.
 * */
public class MonthTicket {

    private String owner;

    public MonthTicket(String owner) {
        this.owner = owner;
    }

    /* 월 회원권은 횟수를 세지 않으므로 늘 들어올 수 있다. */
    public boolean use(String where) {
        System.out.println(owner + " " + where + " 입장, 월 회원권");
        return true;
    }
}