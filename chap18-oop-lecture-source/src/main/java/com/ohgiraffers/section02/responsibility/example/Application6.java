package com.ohgiraffers.section02.responsibility.example;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 프레임워크에 묶인 객체 (1)
         *BeanCoupon은 프레임워크가 정한 ShopBean을 물려받았다.
         *할인 계산 하나만 확인하고 싶어도 ShopContainer를 먼저 시작하지 않으면 객체를 만들 수 없다.
         * */
        try {
            BeanCoupon coupon = new BeanCoupon();
            System.out.println("결제 금액: " + coupon.applyTo(15000));
        } catch (IllegalStateException e) {
            System.out.println("쿠폰을 만들 수 없다: " + e.getMessage());
        }
    }
}