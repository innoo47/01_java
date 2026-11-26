package com.ohgiraffers.section02.responsibility.example;

public class Application5 {

    public static void main(String[] args) {

        /*
         * POJO(Plain Old Java Object)
         *     특정 프레임워크나 화면 출력에 묶이지 않은 평범한 자바 객체다.
         *     Coupon은 System.out을 쓰지 않고 자기 데이터로 계산만 한다. 출력은 Application5가 맡는다.
         * */
        Coupon coupon = new Coupon("첫 주문 쿠폰", 1000);

        System.out.println("쿠폰 이름: " + coupon.getName());
        System.out.println("결제 금액: " + coupon.applyTo(15000));
        System.out.println("쿠폰 할인: " + coupon.getDiscount());
    }
}