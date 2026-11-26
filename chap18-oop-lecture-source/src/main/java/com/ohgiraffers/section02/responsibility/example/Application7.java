package com.ohgiraffers.section02.responsibility.example;

public class Application7 {
    public static void main(String[] args) {
        Coupon coupon = new Coupon("첫 주문 쿠폰", 1000);
        int payment = coupon.applyTo(15000);

        System.out.println("화면 : " + coupon.getName() + "적용, 결제 금액 " + payment + "원");
        System.out.println("문자 : [서점] 결제 금액은 " + payment + "원입니다");

    }
}
