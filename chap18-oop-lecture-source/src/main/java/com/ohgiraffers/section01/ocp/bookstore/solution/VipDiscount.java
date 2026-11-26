package com.ohgiraffers.section01.ocp.bookstore.solution;

public class VipDiscount implements DiscountPolicy {
    @Override
    public int discount(int amount) {
        return amount * 10 / 100;
    }
}
