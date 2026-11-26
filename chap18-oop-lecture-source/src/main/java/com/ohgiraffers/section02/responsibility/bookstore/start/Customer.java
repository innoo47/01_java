package com.ohgiraffers.section02.responsibility.bookstore.start;

public class Customer {

    private String name;
    private int discountRate;

    public Customer(String name, int discountRate) {
        this.name = name;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}