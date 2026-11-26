package com.ohgiraffers.section01.ocp.bookstore.solution;

public class GoldDiscount implements DiscountPolicy {
    @Override
    public int discount(int amount) {
        return amount * 5 / 100;
    }
}
