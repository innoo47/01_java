package com.ohgiraffers.section02.responsibility.example;

/* 프레임워크(ShopBean)에 묶이고, 화면 출력까지 직접 하는 쿠폰이다. POJO가 아니다. */
public class BeanCoupon extends ShopBean {

    private String name;
    private int discount;

    @Override
    public void init() {
        name = "첫 주문 쿠폰";
        discount = 1000;
    }

    public String getName() {
        return name;
    }

    public int applyTo(int price) {
        System.out.println("쿠폰 할인: " + discount);
        return price - discount;
    }
}