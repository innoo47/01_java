package com.ohgiraffers.section02.responsibility.example;

public class Coupon {

    private String name;
    private int discount;

    public Coupon(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public int applyTo(int price) {
        return price - discount;
    }
}