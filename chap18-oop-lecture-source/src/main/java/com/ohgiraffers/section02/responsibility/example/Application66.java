package com.ohgiraffers.section02.responsibility.example;

public class Application66 {

    public static void main(String[] args) {

        /*
         * 프레임워크에 묶인 객체 (2)
         *  ShopContainer를 시작하고 init()까지 불러야 BeanCoupon을 쓸 수 있다.
         *  문자 안내 문장만 만들고 싶은데, applyTo 안의 화면 출력이 함께 찍힌다.
         * */
        ShopContainer.start();
        BeanCoupon coupon = new BeanCoupon();
        coupon.init();

        String message = "[서점] 결제 금액은 " + coupon.applyTo(15000) + "원입니다.";

        System.out.println("문자: " + message);
    }
}