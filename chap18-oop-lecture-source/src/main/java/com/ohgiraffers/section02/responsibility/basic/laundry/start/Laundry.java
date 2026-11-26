package com.ohgiraffers.section02.responsibility.basic.laundry.start;

/* 세탁 주문 하나를 나타내는 클래스다. 셔츠 한 벌의 세탁 요금은 3000원이다. */
public class Laundry {

    private String customer;
    private int shirts;

    public Laundry(String customer, int shirts) {
        this.customer = customer;
        this.shirts = shirts;
    }

    public String getCustomer() {
        return customer;
    }

    public int getShirts() {
        return shirts;
    }

    // TODO 단계 1: 세탁 요금(shirts * 3000)을 돌려주는 int fee() 메소드를 만든다
    public int fee() {
        return shirts * 3000;
    }

    // TODO 단계 4: 쓰는 곳이 없는 printScreen()과 printMessage()를 지운다

}